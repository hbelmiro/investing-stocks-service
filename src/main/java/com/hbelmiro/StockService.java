package com.hbelmiro;

import java.math.BigDecimal;

public interface StockService {

    BigDecimal getCurrentValue(String symbol);

}
