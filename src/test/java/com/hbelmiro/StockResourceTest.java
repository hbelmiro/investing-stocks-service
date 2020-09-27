package com.hbelmiro;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class StockResourceTest {

    @Inject
    @TestMode
    StockResource stockResource;

    @Test
    public void getTest() {
        assertEquals(this.stockResource.get("aapl"), new BigDecimal("123.45"));
    }

}
