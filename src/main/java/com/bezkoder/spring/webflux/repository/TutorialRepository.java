package com.bezkoder.spring.webflux.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.webflux.model.Tutorial;

import reactor.core.publisher.Flux;

@Repository
public interface TutorialRepository extends R2dbcRepository<Tutorial, Integer>{
  Flux<Tutorial> findByTitleContaining(String title);
  
  Flux<Tutorial> findByPublished(boolean isPublished);
}
