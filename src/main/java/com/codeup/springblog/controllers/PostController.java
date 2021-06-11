package com.codeup.springblog.controllers;

import com.codeup.springblog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

//    @GetMapping("/posts")
//    @ResponseBody
//    public String getPostsIndexPage() {
//        return "posts index page";
//    }
//
//    @GetMapping("/posts/{id}")
//    @ResponseBody
//    public String getPostsById(@PathVariable long id) {
//        return "view an individual post by id #" + id;
//    }
//
//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String createPostsForm() {
//        return "view form for creating a post";
//    }
//
//    @PostMapping("posts/create")
//    @ResponseBody
//    public String createPosts() {
//        return "create a new post";
//    }

    @GetMapping("/posts")
    public String getAllPosts(Model model) {
        List<Post> listOfPosts = new ArrayList<>();

        Post funnyPost = new Post("Funny Post", "Pudding...");
        Post smartPost = new Post("Smart Post", "Apple + Bananas = Oranges...");

        listOfPosts.add(funnyPost);
        listOfPosts.add(smartPost);

        model.addAttribute("posts", listOfPosts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String getOnePost(@PathVariable long id, Model model) {
        Post post = new Post(id, "My first title", "All the content with in context of my title");
        model.addAttribute("id", post.getId());
        model.addAttribute("title", post.getTitle());
        model.addAttribute("body", post.getBody());
        return "posts/show";
    }
}
