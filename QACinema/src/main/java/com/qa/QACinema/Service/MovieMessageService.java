package com.qa.QACinema.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.QACinema.Entities.MovieMessage;
import com.qa.QACinema.Entities.User;
import com.qa.QACinema.Repositories.MovieMessageRepository;


@Service
public class MovieMessageService {
	
	 @Autowired
	 private MovieMessageRepository movieRepository;
	 
	 public List<MovieMessage> getAllMovieMessages(){
	        return movieRepository.findAll();
	    }
	 
	 public void insert(MovieMessage movie) {
	        movieRepository.save(movie);
	    }
	 
	 public boolean deleteMovieMessage(Long moviemessageID){
	        MovieMessage thePost = movieRepository.findOne(moviemessageID);
	        if(thePost == null)
	            return false;
	        movieRepository.delete(moviemessageID);
	        return true;
	    }
	 
	 public MovieMessage getMovieMessage(Long id) {
	        return movieRepository.findOne(id);
	    }

}
