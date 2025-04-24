package com.example.blog.controller;

import com.example.blog.model.Post;
import com.example.blog.service.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin(origins = "*")

public class PostController {
    private final PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }
    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }
    @GetMapping("/{id}")
    public Optional<Post> getPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }
    @PutMapping("/{id}")
    public Optional<Post> updatePost(@PathVariable Long id, @RequestBody Post post) {
        return postService.updatePost(id, post);
    }
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePost(id);
    }
}
