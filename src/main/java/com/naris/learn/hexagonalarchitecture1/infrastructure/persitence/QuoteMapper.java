package com.naris.learn.hexagonalarchitecture1.infrastructure.persitence;


import com.naris.learn.hexagonalarchitecture1.domain.model.QuoteDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface QuoteMapper {

    QuoteMapper INSTANCE = Mappers.getMapper(QuoteMapper.class);

    Quote quoteDtoToQuote(QuoteDto quoteDto);
    QuoteDto quoteToQuoteDto(Quote quote);

    List<Quote> listQuoteDtoToListQuote(List<QuoteDto> quoteDtoList);
    List<QuoteDto> listQuoteToListQuoteDto(List<Quote> quoteList);
}
