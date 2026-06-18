package com.demo.dao;

import com.demo.model.Friend;

public class FriendDaoImpl implements FriendDao {
    private Friend[] friends = new Friend[20];
    private int count;

    public void add(Friend friend) {
        if (count == friends.length) {
            throw new IllegalStateException("Friend storage is full");
        }
        friends[count++] = friend;
    }

    public Friend[] findAll() {
        Friend[] result = new Friend[count];
        System.arraycopy(friends, 0, result, 0, count);
        return result;
    }

    public Friend findById(int id) {
        for (int i = 0; i < count; i++) {
            if (friends[i].getId() == id) {
                return friends[i];
            }
        }
        return null;
    }

    public Friend[] findByName(String name) {
        Friend[] temp = new Friend[count];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (friends[i].getName().equalsIgnoreCase(name)) {
                temp[index++] = friends[i];
            }
        }
        Friend[] result = new Friend[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    public Friend[] findByHobby(String hobby) {
        Friend[] temp = new Friend[count];
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (friends[i].hasHobby(hobby)) {
                temp[index++] = friends[i];
            }
        }
        Friend[] result = new Friend[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }
}