package com.naris.learn.hexagonalarchitecture1.domain.model;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class QuoteDto {
    private int id;
    private String sentence;
    private String author;
}
