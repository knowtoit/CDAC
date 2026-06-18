package com.demo.dao;

import com.demo.model.User;
import java.sql.SQLException;

public interface UserDao {
    User find(String username, String address) throws SQLException;
    void add(User user) throws SQLException;
}