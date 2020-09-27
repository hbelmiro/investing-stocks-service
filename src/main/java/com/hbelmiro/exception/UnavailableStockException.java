package com.hbelmiro.exception;

public class UnavailableStockException extends RuntimeException {

    public UnavailableStockException(String symbol, Throwable cause) {
        super("Unavailable stock: " + symbol, cause);
    }

}
