package com.company.test;

import com.company.lesson02.User;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        user.age = 25;
        user.name = "Alex";
        user.passportData = "pas";
        System.out.println(user.name);
        user.talk("Hello");


        User user1 = new User();
        user1.age = 30;
        user1.name= "Tom";
        user1.passportData = "pas1";
        System.out.println(user1.name);
        user1.talk("Hi");
    }
}
