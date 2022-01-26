package com.naris.learn.hexagonalarchitecture1.domain.ports;

import com.naris.learn.hexagonalarchitecture1.domain.models.Quote;

import java.util.List;

public interface ICrudQuote {
    List<Quote> getAll();
    Quote getOne(int id);
    Quote save(Quote quote);
}
