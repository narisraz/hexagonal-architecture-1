package com.naris.learn.hexagonalarchitecture1.domain;

import com.naris.learn.hexagonalarchitecture1.domain.model.QuoteDto;
import com.naris.learn.hexagonalarchitecture1.domain.ports.in.QuoteService;
import com.naris.learn.hexagonalarchitecture1.domain.ports.out.QuoteRepository;

import java.util.List;

public class DomainQuoteService implements QuoteService {

    private QuoteRepository quoteRepository;

    public DomainQuoteService(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @Override
    public List<QuoteDto> getAll() {
        return quoteRepository.getAll();
    }

    @Override
    public QuoteDto getOne(int id) {
        return quoteRepository.getOne(id);
    }

    @Override
    public QuoteDto save(QuoteDto quoteDto) {
        return quoteRepository.save(quoteDto);
    }
}
