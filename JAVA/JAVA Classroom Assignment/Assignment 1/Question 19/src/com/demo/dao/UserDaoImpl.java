package com.demo.dao;

import com.demo.model.User;
import com.demo.dao.DbConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    public User find(String username, String address) throws SQLException {
        try (Connection con = DbConfig.getConnection();
             PreparedStatement ps = con.prepareStatement("select * from userinfo where username=? and address=?")) {
            ps.setString(1, username);
            ps.setString(2, address);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new User(rs.getString("username"), rs.getString("address"), rs.getString("mobile"), rs.getString("email"));
                }
                return null;
            }
        }
    }

    public void add(User user) throws SQLException {
        try (Connection con = DbConfig.getConnection();
             PreparedStatement ps = con.prepareStatement("insert into userinfo values(?,?,?,?)")) {
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getAddress());
            ps.setString(3, user.getMobile());
            ps.setString(4, user.getEmail());
            ps.executeUpdate();
        }
    }
}