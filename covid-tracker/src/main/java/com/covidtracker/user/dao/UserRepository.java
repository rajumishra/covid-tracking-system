package com.covidtracker.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.covidtracker.user.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User getUserByUsername(String username);
}