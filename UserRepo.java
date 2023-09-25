package com.example.demo.Repo;

import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserRepo {

    @Autowired
    private List<User> usrList;

    public List<User> getUsrList() {
        return usrList;
    }
}
