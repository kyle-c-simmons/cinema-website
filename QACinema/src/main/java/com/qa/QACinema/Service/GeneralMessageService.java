package com.qa.QACinema.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.QACinema.Entities.GeneralMessage;
import com.qa.QACinema.Entities.User;
import com.qa.QACinema.Repositories.GeneralMessageRepository;


@Service
public class GeneralMessageService {

	    @Autowired
	    private GeneralMessageRepository gmRepository;

	    public List<GeneralMessage> getAllGeneralMessages(){
	        return gmRepository.findAll();
	    }

	    public void insert(GeneralMessage gm) {
	        gmRepository.save(gm);
	    }

	    

	    public boolean deleteGeneralMessage(Long gmId){
	        GeneralMessage thePost = gmRepository.findOne(gmId);
	        if(thePost == null)
	            return false;
	        gmRepository.delete(gmId);
	        return true;
	    }

	    public GeneralMessage getGeneralMessage(Long id) {
	        return gmRepository.findOne(id);
	    }

	    public GeneralMessage find(Long gmId) {
	        return gmRepository.findOne(gmId);
	    }

}
