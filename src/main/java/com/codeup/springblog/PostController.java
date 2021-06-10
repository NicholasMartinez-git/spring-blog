package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String getPostsIndexPage() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String getPostsById(@PathVariable long id) {
//        String idNumStr = String.valueOf(id);
        return "view an individual post by id #" + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPostsForm() {
        return "view form for creating a post";
    }

    @PostMapping("posts/create")
    @ResponseBody
    public String createPosts() {
        return "create a new post";
    }
}