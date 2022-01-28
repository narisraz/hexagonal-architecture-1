package com.naris.learn.hexagonalarchitecture1.infrastructure.persitence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteJpaRepository extends JpaRepository<Quote, Integer> {
}
