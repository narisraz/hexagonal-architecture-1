package com.naris.learn.hexagonalarchitecture1.infrastructure.persitence;

import com.naris.learn.hexagonalarchitecture1.domain.models.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteJpaRepository extends JpaRepository<Quote, Integer> {
}
