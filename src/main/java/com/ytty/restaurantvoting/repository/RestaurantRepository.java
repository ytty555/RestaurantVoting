package com.ytty.restaurantvoting.repository;

import com.ytty.restaurantvoting.model.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository {

    Restaurant save(Restaurant restaurant, int userId);

    List<Restaurant> getAll(int userId);

    Optional<Restaurant> getById(int id, int userId);

    boolean delete(int id, int userId);
}
