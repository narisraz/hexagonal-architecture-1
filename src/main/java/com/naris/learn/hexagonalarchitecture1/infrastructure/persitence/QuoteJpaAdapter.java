package com.naris.learn.hexagonalarchitecture1.infrastructure.persitence;

import com.naris.learn.hexagonalarchitecture1.domain.model.QuoteDto;
import com.naris.learn.hexagonalarchitecture1.domain.ports.out.QuoteRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuoteJpaAdapter implements QuoteRepository {
    private QuoteJpaRepository quoteJpaRepository;

    public QuoteJpaAdapter(QuoteJpaRepository quoteJpaRepository) {
        this.quoteJpaRepository = quoteJpaRepository;
    }

    @Override
    public List<QuoteDto> getAll() {
        return QuoteMapper.INSTANCE.listQuoteToListQuoteDto(quoteJpaRepository.findAll());
    }

    @Override
    public QuoteDto getOne(int id) {
        return QuoteMapper.INSTANCE.quoteToQuoteDto(quoteJpaRepository.findById(id).get());
    }

    @Override
    public QuoteDto save(QuoteDto quoteDto) {
        Quote quote = QuoteMapper.INSTANCE.quoteDtoToQuote(quoteDto);
        return QuoteMapper.INSTANCE.quoteToQuoteDto(quoteJpaRepository.save(quote));
    }
}
