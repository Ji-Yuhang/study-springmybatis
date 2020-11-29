package com.jiyuhang.service;

import com.jiyuhang.entity.User;

import java.util.List;

public interface UserService {
    public String setName(String name);
    public void save(User user);
    public List<User> findAll();
    public User findById(Long id);
    public int getCount();
    public void update(User user);


}
