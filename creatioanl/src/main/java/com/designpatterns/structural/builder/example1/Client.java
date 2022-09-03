package com.designpatterns.structural.builder.example1;

public class Client {

    public static void main(String[] args) {
        User user = User.UserBuilder("Mahmoud", "Youssef").withEmail("testEmail").withAge(30).build();
        System.out.println(user);
    }

}
