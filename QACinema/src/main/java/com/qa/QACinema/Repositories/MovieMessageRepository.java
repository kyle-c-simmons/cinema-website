package com.qa.QACinema.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.qa.QACinema.Entities.MovieMessage;

public interface MovieMessageRepository extends JpaRepository<MovieMessage,Long> {
	
}

