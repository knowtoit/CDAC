package com.demo.service;

import com.demo.model.User;
import java.sql.SQLException;

public interface UserService {
    User searchUser(String username, String address) throws SQLException;
    void addUser(User user) throws SQLException;
}