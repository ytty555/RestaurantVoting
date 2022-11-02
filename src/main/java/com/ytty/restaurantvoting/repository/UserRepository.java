package com.ytty.restaurantvoting.repository;

import com.ytty.restaurantvoting.model.Role;
import com.ytty.restaurantvoting.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    User save(User user, int userId);

    List<User> getAll(int userId);

    List<User> getAllByRole(Role role, int userId);

    Optional<User> getById(int id, int userId);

    boolean delete(int id, int userId);
}
