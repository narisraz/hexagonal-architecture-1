package com.naris.learn.hexagonalarchitecture1.domain.services;

import com.naris.learn.hexagonalarchitecture1.domain.models.Quote;
import com.naris.learn.hexagonalarchitecture1.domain.ports.ICrudQuote;
import com.naris.learn.hexagonalarchitecture1.domain.ports.IRequestQuote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuoteService implements IRequestQuote {

    @Autowired
    private ICrudQuote crudQuote;

    @Override
    public List<Quote> getAll() {
        return crudQuote.getAll();
    }

    @Override
    public Quote getOne(int id) {
        return crudQuote.getOne(id);
    }

    @Override
    public Quote save(Quote quote) {
        return crudQuote.save(quote);
    }
}
