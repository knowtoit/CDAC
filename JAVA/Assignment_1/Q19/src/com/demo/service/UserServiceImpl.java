package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.model.User;
import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    private UserDao dao;

    public UserServiceImpl(UserDao dao) { this.dao = dao; }
    public User searchUser(String username, String address) throws SQLException { return dao.find(username, address); }
    public void addUser(User user) throws SQLException { dao.add(user); }
}