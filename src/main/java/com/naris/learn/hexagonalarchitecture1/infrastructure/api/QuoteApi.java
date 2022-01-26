package com.naris.learn.hexagonalarchitecture1.infrastructure.api;

import com.naris.learn.hexagonalarchitecture1.domain.models.Quote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuoteApi {

    @Autowired
    private QuoteApiAdapter quoteApiAdapter;

    @GetMapping(value = "/quote/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Quote getQuote(@PathVariable int id) {
        return quoteApiAdapter.getQuote(id);
    }

    @GetMapping(value = "/quotes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Quote> getQuotes() {
        return quoteApiAdapter.getQuotes();
    }

    @PostMapping(value = "/quotes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Quote saveQuote(@RequestBody Quote quote) {
        return quoteApiAdapter.saveQuote(quote);
    }
}
