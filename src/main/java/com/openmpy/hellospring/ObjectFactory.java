package com.openmpy.hellospring;

import com.openmpy.hellospring.exrate.CachedExRateProvider;
import com.openmpy.hellospring.exrate.WebApiExRateProvider;
import com.openmpy.hellospring.payment.ExRateProvider;
import com.openmpy.hellospring.payment.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectFactory {

    @Bean
    public PaymentService paymentService() {
        return new PaymentService(cachedExRateProvider());
    }

    @Bean
    public ExRateProvider exRateProvider() {
        return new WebApiExRateProvider();
    }

    @Bean
    public ExRateProvider cachedExRateProvider() {
        return new CachedExRateProvider(exRateProvider());
    }
}
