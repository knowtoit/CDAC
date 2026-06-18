package com.demo.service;

import com.demo.dao.FriendDao;
import com.demo.model.Friend;

public class FriendServiceImpl implements FriendService {
    private FriendDao dao;

    public FriendServiceImpl(FriendDao dao) {
        this.dao = dao;
    }

    public void addFriend(Friend friend) {
        dao.add(friend);
    }

    public Friend[] getAllFriends() {
        return dao.findAll();
    }

    public Friend searchById(int id) {
        return dao.findById(id);
    }

    public Friend[] searchByName(String name) {
        return dao.findByName(name);
    }

    public Friend[] searchByHobby(String hobby) {
        return dao.findByHobby(hobby);
    }
}