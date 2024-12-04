package com.example.socialmediaminiapp.controller;

import com.example.socialmediaminiapp.entity.posts;
import com.example.socialmediaminiapp.entity.users;
import com.example.socialmediaminiapp.service.SocialMediaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/l1/socialmedia")
@RequiredArgsConstructor
public class SocialMediaController {

    private final SocialMediaService socialMediaService;

    @PostMapping("/posts")
    public ResponseEntity<posts> createPost(@RequestBody posts post) {
        return ResponseEntity.ok(socialMediaService.createPost(post));
    }

    @GetMapping("/posts/hashtag/{hashtag}")
    public ResponseEntity<List<posts>> getPostsByHashtag(@PathVariable String hashtag) {
        return ResponseEntity.ok(socialMediaService.getPostsByHashtag(hashtag));
    }

    @GetMapping("/posts/author/{authorId}")
    public ResponseEntity<List<posts>> getPostsByAuthor(@PathVariable String authorId) {
        return ResponseEntity.ok(socialMediaService.getPostsByAuthor(authorId));
    }

    @PostMapping("/users")
    public ResponseEntity<users> registerUser(@RequestBody users user) {
        return ResponseEntity.ok(socialMediaService.registerUser(user));
    }

    @GetMapping("/users/{username}")
    public ResponseEntity<users> getUserByUsername(@PathVariable String username) {
        return ResponseEntity.of(socialMediaService.getUserByUsername(username));
    }
}
