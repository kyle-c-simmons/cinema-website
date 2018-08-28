package com.qa.QACinema.Entities;

import org.bson.types.ObjectId;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Screen {

    @Id
    @GeneratedValue
    public Long id;
    
    private String screenName;
    
   
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Time> time;
    private boolean screenBooked;
    

    @ManyToOne
    private User creator;
    
    Screen(){}
    
    public Screen(String screenName, boolean screenBooked, List<Time> time) {
    	this.screenName = screenName;
    	this.screenBooked = screenBooked;
    	this.time = time;
    	
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	

	public List<Time> getTime() {
		return time;
	}

	public void setTime(List<Time> time) {
		this.time = time;
	}

	public boolean isScreenBooked() {
		return screenBooked;
	}

	public void setScreenBooked(boolean screenBooked) {
		this.screenBooked = screenBooked;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	
    
    
}
