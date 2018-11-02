package com.deliclouds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deliclouds.datamodels.Restaurant;
import com.deliclouds.datamodels.RestaurantTranslation;
import com.deliclouds.datamodels.RestaurantTranslationID;
import com.deliclouds.repositories.RestaurantRepository;
import com.deliclouds.repositories.RestaurantTranslationRepository;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository resRepo;
    @Autowired
    private RestaurantTranslationRepository resTransRepo;

    public Restaurant findRestaurantById(int id) {
        System.out.println(id);
        return resRepo.findById(id).get();
    }

    public Restaurant addRestaurant(Restaurant res) {
        return this.resRepo.save(res);
    }

    public void deleteRestaurant(Restaurant res) {
        this.resRepo.delete(res);
    }

    public void updateRestaurant(Restaurant res) {
        this.resRepo.save(res);
    }

    public Iterable<Restaurant> getRestaurants() {
        return this.resRepo.findAll();
    }

    public void addRestaurantTranslations(List<RestaurantTranslation> translations) {
        this.resTransRepo.saveAll(translations);
    }

    public RestaurantTranslation addRestaurantTranslation(RestaurantTranslation translation) {
        return this.resTransRepo.save(translation);
    }

    public Iterable<RestaurantTranslation> getRestaurantTranslation() {
        return this.resTransRepo.findAll();
    }

    public Restaurant getRestaurantById(int restaurantIndex) {
        return resRepo.getRestaurantById(restaurantIndex);
    }

    public RestaurantTranslation getRestaruantTranslationByIdandLanguage(int restaurant, int language) {
        for (RestaurantTranslation restaurantTranslation : this.resTransRepo.findAll()) {
            RestaurantTranslationID rid = restaurantTranslation.getId();
            if (rid.getLanguageId().equals(language) && rid.getRestaurantId().equals(restaurant)) {
                return restaurantTranslation;
            }
        }
        return new RestaurantTranslation();
    }


}