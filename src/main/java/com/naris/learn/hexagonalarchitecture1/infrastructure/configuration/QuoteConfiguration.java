package com.naris.learn.hexagonalarchitecture1.infrastructure.configuration;

import com.naris.learn.hexagonalarchitecture1.domain.DomainQuoteService;
import com.naris.learn.hexagonalarchitecture1.domain.ports.in.QuoteService;
import com.naris.learn.hexagonalarchitecture1.domain.ports.out.QuoteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuoteConfiguration {

    @Bean
    QuoteService createCreateQuoteService(QuoteRepository quoteRepository) {
        return new DomainQuoteService(quoteRepository);
    }
}
