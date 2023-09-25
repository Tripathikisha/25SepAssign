package com.example.demo.Service;


import com.example.demo.Entity.User;
import com.example.demo.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public List<User> getAllUser() {
        return userRepo.getUsrList();
    }

    public String addUsers(List<User> myUsers) {

        getAllUser().addAll(myUsers);

        return myUsers.size() + " users were added!";
    }


    }

