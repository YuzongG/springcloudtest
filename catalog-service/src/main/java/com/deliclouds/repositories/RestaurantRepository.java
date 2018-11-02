package com.deliclouds.repositories;

import org.springframework.data.repository.CrudRepository;

import com.deliclouds.datamodels.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>{
	public Restaurant getRestaurantById(int i);
}
