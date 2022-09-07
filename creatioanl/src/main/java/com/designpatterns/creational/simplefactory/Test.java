package com.designpatterns.creational.simplefactory;

public class Test {

    public static void main(String[] args) {
        Post post = PostFactory.createPost("blog");
        System.out.println(post);
        // BlogPost object created
    }

}
