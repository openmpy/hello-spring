package com.openmpy.hellospring.payment;

import java.io.IOException;
import java.math.BigDecimal;

public class ExRateProviderStub implements ExRateProvider {

    private BigDecimal exRate;

    public ExRateProviderStub(BigDecimal exRate) {
        this.exRate = exRate;
    }

    public BigDecimal getExRate() {
        return exRate;
    }

    public void setExRate(BigDecimal exRate) {
        this.exRate = exRate;
    }

    @Override
    public BigDecimal getExRate(String currency) throws IOException {
        return exRate;
    }
}
