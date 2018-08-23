package com.qa.QACinema.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Time {
	
	@Id
	@GeneratedValue
	@JsonIgnore
	private Long id;
	
	private Long screenID;
	
	private String screenTime;
	
	Time(){
		
	}
	
	public Time (String screenTime) {
		this.screenTime = screenTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getScreenTime() {
		return screenTime;
	}

	public void setScreenTime(String screenTime) {
		this.screenTime = screenTime;
	}
	
	
	
	

}
