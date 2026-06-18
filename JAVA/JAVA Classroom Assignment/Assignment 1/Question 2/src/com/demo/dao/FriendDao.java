package com.demo.dao;

import com.demo.model.Friend;

public interface FriendDao {
    void add(Friend friend);
    Friend[] findAll();
    Friend findById(int id);
    Friend[] findByName(String name);
    Friend[] findByHobby(String hobby);
}