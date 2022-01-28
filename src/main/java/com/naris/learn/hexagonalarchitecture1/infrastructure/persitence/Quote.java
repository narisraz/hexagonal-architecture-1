package com.naris.learn.hexagonalarchitecture1.infrastructure.persitence;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Quote {
    @Id
    @GeneratedValue
    private int id;
    private String sentence;
    private String author;
}
