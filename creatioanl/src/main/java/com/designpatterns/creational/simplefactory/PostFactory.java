package com.designpatterns.creational.simplefactory;

public class PostFactory {

    public static Post createPost(String type) {
        return switch (type) {
            case "blog" -> new BlogPost();
            case "news" -> new NewsPost();
            default -> throw new IllegalArgumentException("Post type is unknown");
        };
    }

}
