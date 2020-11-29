package com.jiyuhang.dao;

import com.jiyuhang.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {
    public String setName(String name);
    public void save( User user);
    public List<User> findAll();
    public User findById(Long id);
    public Integer getCount();
    public void update(User user);
}
