package com.ytty.restaurantvoting.repository;

import com.ytty.restaurantvoting.model.Menu;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface MenuRepository {

    Menu save(Menu menu, int userId);

    List<Menu> getAll(int userId);

    List<Menu> getByDate(LocalDate date, int userId);

    Optional<Menu> getByDate(LocalDate date, int restaurantId, int userId);

    Optional<Menu> getById(int menuId, int userId);

    boolean delete(int id, int userId);
}
