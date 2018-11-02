package com.deliclouds.repositories;

import org.springframework.data.repository.CrudRepository;

import com.deliclouds.datamodels.RestaurantTranslation;

public interface RestaurantTranslationRepository extends CrudRepository<RestaurantTranslation, Integer>{

}