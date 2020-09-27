package com.hbelmiro;

import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/stocks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StockResource {

    private final StockService stockService;

    public StockResource(StockService stockService) {
        this.stockService = stockService;
    }

    @GET
    @Path("/{symbol}")
    public BigDecimal get(@PathParam String symbol) {
        return this.stockService.getCurrentValue(symbol);
    }

}