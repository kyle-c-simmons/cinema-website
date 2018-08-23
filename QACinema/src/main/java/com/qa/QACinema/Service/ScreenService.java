package com.qa.QACinema.Service;


import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.QACinema.Entities.Screen;
import com.qa.QACinema.Repositories.ScreenRepository;


@Service
public class ScreenService {
	
	@Autowired
	private ScreenRepository screenRepo; 
	
	
	 
	 public List<Screen> getAllScreens(){
		 
		return screenRepo.findAll();
	 }
	 
	 public void addScreen (Screen screen) {
		 screenRepo.save(screen);
	 }
	  
	 public void updateAccount(Long id, Screen screen) {
		 
		 }
	  
	 public void deleteAccount(Long id) {
		 screenRepo.delete(id);
	 }
			 

}