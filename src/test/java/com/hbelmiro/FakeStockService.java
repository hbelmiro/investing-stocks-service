package com.hbelmiro;

import com.hbelmiro.exception.InvalidStockSymbolException;

import javax.enterprise.context.ApplicationScoped;
import java.math.BigDecimal;

@ApplicationScoped
@TestMode
public class FakeStockService implements StockService {

    @Override
    public BigDecimal getCurrentValue(String symbol) {
        switch (symbol.toLowerCase()) {
            case "aapl":
                return new BigDecimal("123.45");
            case "goog":
                return new BigDecimal("1234.56");
            case "amzn":
                return new BigDecimal("2345.67");
            default:
                throw new InvalidStockSymbolException(symbol);
        }
    }

}
