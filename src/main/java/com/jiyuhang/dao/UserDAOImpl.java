package com.jiyuhang.dao;

import com.jiyuhang.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    @Override
    public String setName(String name) {
        System.out.println("UserDAOImpl setName"+ name);

        return name;
    }

    @Override
    public void save(User user) {
        System.out.println("UserDAOImpl save: "+user.toString());


    }

    @Override
    public List<User> findAll() {
        System.out.println("UserDAOImpl findAll: ");
        // TODO: 使用 mapper 获取数据
        List<User> users= new ArrayList<User>();

        return users;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public Integer getCount() {
        return -1;
    }

    @Override
    public void update(User user) {

    }
}
