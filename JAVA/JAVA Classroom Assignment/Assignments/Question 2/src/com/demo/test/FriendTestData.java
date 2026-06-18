package com.demo.test;

import com.demo.model.Friend;
import com.demo.service.FriendService;
import java.time.LocalDate;

public class FriendTestData {
    public static void load(FriendService service) {
        service.addFriend(new Friend(1, "Amit", "Patil", new String[]{"cricket", "reading"}, "9999999991", "amit@mail.com", LocalDate.of(2000, 1, 10), "Pune"));
        service.addFriend(new Friend(2, "Divya", "Shah", new String[]{"music", "travel"}, "9999999992", "divya@mail.com", LocalDate.of(2001, 5, 12), "Mumbai"));
    }
}