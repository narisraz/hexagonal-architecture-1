package com.naris.learn.hexagonalarchitecture1.domain.ports.in;

import com.naris.learn.hexagonalarchitecture1.domain.model.QuoteDto;

import java.util.List;

public interface QuoteService {
    List<QuoteDto> getAll();

    QuoteDto getOne(int id);

    QuoteDto save(QuoteDto quoteDto);
}
