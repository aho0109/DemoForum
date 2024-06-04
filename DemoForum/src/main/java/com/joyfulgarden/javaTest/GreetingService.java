package com.joyfulgarden.javaTest;

import java.util.List;

import com.joyfulgarden.model.Posts;
import com.joyfulgarden.service.PostsService;

public class GreetingService {

	private final PostsService messageService = new PostsService();

//    public GreetingService(PostsService messageService) {
//        this.messageService = messageService;
//    }

    public String greet(String name) {
        List<Posts> message = messageService.findAllByLastActivityDesc();
        return "Hello, " + name + "! " + message;
    }
}
