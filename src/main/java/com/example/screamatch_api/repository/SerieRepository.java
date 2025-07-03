package com.example.screamatch_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.screamatch_api.model.Serie;

public interface SerieRepository extends JpaRepository<Serie, Long> {

    // This class can be used to define custom query methods if needed.
    // For now, it inherits basic CRUD operations from JpaRepository.
    
}
