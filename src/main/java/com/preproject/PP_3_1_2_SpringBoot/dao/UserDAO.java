package com.preproject.PP_3_1_2_SpringBoot.dao;

import com.preproject.PP_3_1_2_SpringBoot.model.User;

import java.util.List;

public interface UserDAO {

    void updateUser(int id, User user);

    void deleteUser(int id);

    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);
}
