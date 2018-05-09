package com.SpringDemo.services;

import com.SpringDemo.model.User;

import java.util.List;

public interface userServices {

    void addUser(User p);

    User getUserById(Long id); //while updating user
    List<User> getResults();
    void deleteId(Long id);


}
