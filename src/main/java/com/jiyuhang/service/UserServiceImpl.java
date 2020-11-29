package com.jiyuhang.service;

import com.jiyuhang.dao.UserDAO;
import com.jiyuhang.entity.User;

import java.util.List;
import java.util.UUID;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public String setName(String name) {
        System.out.println("UserServiceImpl setName"+ name);
        return userDAO.setName(name);
    }

    @Override
    public void save(User user) {
//        user.setId(Long.valueOf(12));
        userDAO.save(user);
    }

    @Override
    public List<User> findAll() {
        System.out.println("UserServiceImpl findAll");
        System.out.println("userDAO is "+ userDAO);
        return userDAO.findAll();
    }
    @Override
    public User findById(Long id){
        System.out.println("UserServiceImpl findById: "+ id);
        System.out.println("userDAO is "+ userDAO);
        return  userDAO.findById(id);
    }

    @Override
    public int getCount() {
        System.out.println("UserServiceImpl getCount: ");
        System.out.println("userDAO is "+ userDAO);
        return userDAO.getCount();
    }
    @Override
    public void update(User user){
        System.out.println("UserServiceImpl update user: "+ user.toString());
        userDAO.update(user);
    }

}
