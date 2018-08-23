package com.qa.QACinema.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.qa.QACinema.Entities.GeneralMessage;

public interface GeneralMessageRepository extends JpaRepository<GeneralMessage, Long> {
	
}
