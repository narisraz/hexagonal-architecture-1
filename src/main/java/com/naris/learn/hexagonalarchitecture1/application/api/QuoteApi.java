package com.naris.learn.hexagonalarchitecture1.application.api;

import com.naris.learn.hexagonalarchitecture1.domain.model.QuoteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuoteApi {

    @Autowired
    private QuoteApiAdapter quoteApiAdapter;

    @GetMapping(value = "/quote/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public QuoteDto getQuote(@PathVariable int id) {
        return quoteApiAdapter.getQuote(id);
    }

    @GetMapping(value = "/quotes", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<QuoteDto> getQuotes() {
        return quoteApiAdapter.getQuotes();
    }

    @PostMapping(value = "/quotes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public QuoteDto saveQuote(@RequestBody QuoteDto quoteDto) {
        return quoteApiAdapter.saveQuote(quoteDto);
    }
}
