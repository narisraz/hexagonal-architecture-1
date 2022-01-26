package com.naris.learn.hexagonalarchitecture1.infrastructure.api;

import com.naris.learn.hexagonalarchitecture1.domain.models.Quote;
import com.naris.learn.hexagonalarchitecture1.domain.ports.ICrudQuote;
import com.naris.learn.hexagonalarchitecture1.domain.ports.IRequestQuote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteApiAdapter {

    @Autowired
    private IRequestQuote requestQuote;

    public List<Quote> getQuotes() {
        return requestQuote.getAll();
    }

    public Quote getQuote(int id) {
        return requestQuote.getOne(id);
    }

    public Quote saveQuote(Quote quote) {
        return requestQuote.save(quote);
    }
}
