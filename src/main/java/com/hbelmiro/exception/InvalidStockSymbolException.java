package com.hbelmiro.exception;

import java.text.MessageFormat;

public class InvalidStockSymbolException extends RuntimeException {

    private final String symbol;

    public InvalidStockSymbolException(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String getMessage() {
        return MessageFormat.format("Invalid symbol: {0}", this.symbol);
    }

}
