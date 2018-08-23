package com.qa.QACinema.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.QACinema.Entities.GeneralMessage;
import com.qa.QACinema.Entities.IntroductionMessage;
import com.qa.QACinema.Entities.MovieMessage;
import com.qa.QACinema.Repositories.IntroductionMessageRepository;
import com.qa.QACinema.Repositories.MovieMessageRepository;

@Service
public class IntroductionMessageService {
	
	 @Autowired
	 private IntroductionMessageRepository introRepository;
	 
	 public List<IntroductionMessage> getAllIntroductionMessages(){
	        return introRepository.findAll();
	    }
	 
	 public void insert(IntroductionMessage intro) {
	        introRepository.save(intro);
	    }
	 
	 public boolean deleteIntroductionMessage(Long introId){
	        IntroductionMessage thePost = introRepository.findOne(introId);
	        if(thePost == null)
	            return false;
	        introRepository.delete(introId);
	        return true;
	    }
	 
	 public IntroductionMessage getIntrodutionMessage(Long id) {
	        return introRepository.findOne(id);
	    }
	 
	 public IntroductionMessage find(Long introId) {
	        return introRepository.findOne(introId);
	    }
	 
}

