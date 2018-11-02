package com.deliclouds.datamodels;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant_language")
public class RestaurantLanguage {
	@EmbeddedId
	private RestaurantLanguageID id;

	public RestaurantLanguage() {
		this.id = new RestaurantLanguageID();
	}

	public void setId(RestaurantLanguageID id) {
		this.id = id;
	}

	public RestaurantLanguageID getId() {
		return this.id;
	}
}

