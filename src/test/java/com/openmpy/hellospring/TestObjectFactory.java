package com.openmpy.hellospring;

import com.openmpy.hellospring.payment.ExRateProvider;
import com.openmpy.hellospring.payment.ExRateProviderStub;
import com.openmpy.hellospring.payment.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class TestObjectFactory {

    @Bean
    public PaymentService paymentService() {
        return new PaymentService(exRateProvider());
    }

    @Bean
    public ExRateProvider exRateProvider() {
        return new ExRateProviderStub(BigDecimal.valueOf(1_000));
    }
}
