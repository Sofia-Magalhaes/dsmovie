package com.devsuperior.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demo.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
