package com.hbelmiro;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

public class TestModeStockResourceFactory {

    @Inject
    @TestMode
    FakeStockService stockService;

    @Produces
    @TestMode
    public StockResource stockResource() {
        return new StockResource(this.stockService);
    }

}
