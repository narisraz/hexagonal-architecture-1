package com.naris.learn.hexagonalarchitecture1.infrastructure.persitence;

import com.naris.learn.hexagonalarchitecture1.domain.models.Quote;
import com.naris.learn.hexagonalarchitecture1.domain.ports.ICrudQuote;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuoteJpaAdapter implements ICrudQuote {
    private QuoteJpaRepository quoteJpaRepository;

    public QuoteJpaAdapter(QuoteJpaRepository quoteJpaRepository) {
        this.quoteJpaRepository = quoteJpaRepository;
    }

    @Override
    public List<Quote> getAll() {
        return quoteJpaRepository.findAll();
    }

    @Override
    public Quote getOne(int id) {
        return quoteJpaRepository.findById(id).get();
    }

    @Override
    public Quote save(Quote quote) {
        return quoteJpaRepository.save(quote);
    }
}
