package com.naris.learn.hexagonalarchitecture1.application.api;

import com.naris.learn.hexagonalarchitecture1.domain.model.QuoteDto;
import com.naris.learn.hexagonalarchitecture1.domain.ports.in.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteApiAdapter {

    @Autowired
    private QuoteService quoteService;

    public List<QuoteDto> getQuotes() {
        return quoteService.getAll();
    }

    public QuoteDto getQuote(int id) {
        return quoteService.getOne(id);
    }

    public QuoteDto saveQuote(QuoteDto quoteDto) {
        return quoteService.save(quoteDto);
    }
}
