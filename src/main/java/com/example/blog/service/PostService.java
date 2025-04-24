package com.example.blog.service;

import com.example.blog.model.Post;
import com.example.blog.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;
     public PostService(PostRepository postRepository) {
         this.postRepository = postRepository;
     }

     public List<Post> getAllPosts() {
         return postRepository.findAll();
     }
     public Post createPost(Post post) {
         return postRepository.save(post);
     }
     public Optional<Post> getPostById(Long id) {
         return postRepository.findById(id);
     }
     public void deletePost(Long id) {
         postRepository.deleteById(id);
     }
     public Optional<Post> updatePost(Long id, Post updatedPost) {
         return postRepository.findById(id).map(post -> {
             post.setTitle(updatedPost.getTitle());
             post.setContent(updatedPost.getContent());
             return postRepository.save(post);
         });


     }
}
