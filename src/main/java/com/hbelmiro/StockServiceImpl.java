package com.hbelmiro;

import com.hbelmiro.exception.InvalidStockSymbolException;
import com.hbelmiro.exception.UnavailableStockException;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import javax.enterprise.context.ApplicationScoped;
import java.io.IOException;
import java.math.BigDecimal;

@ApplicationScoped
public class StockServiceImpl implements StockService {

    @Override
    public BigDecimal getCurrentValue(String symbol) {
        Stock stock;

        try {
            stock = YahooFinance.get(symbol);
        } catch (IOException e) {
            throw new UnavailableStockException(symbol, e);
        }

        if (stock != null) {
            return stock.getQuote().getPrice();
        } else {
            throw new InvalidStockSymbolException(symbol);
        }
    }

}
