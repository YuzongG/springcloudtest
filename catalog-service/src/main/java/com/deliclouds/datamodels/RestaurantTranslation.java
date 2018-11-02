package com.deliclouds.datamodels;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="restaurant_translation")
public class RestaurantTranslation {
	@EmbeddedId
	private RestaurantTranslationID id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="description")
	private String description;
	@Column(name="rolling_texts")
	private String rolling_texts;
	
	public RestaurantTranslationID getId(){
		return this.id;
	}
	
	public void setId(RestaurantTranslationID id){
		this.id = id;
	}
	
	public String getRollingTexts() {
		return this.rolling_texts;
	}
	
	public void setRollingTexts(String text) {
		this.rolling_texts = text;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}

