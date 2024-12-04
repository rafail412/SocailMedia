package com.example.socialmediaminiapp.service;


import com.example.socialmediaminiapp.entity.posts;
import com.example.socialmediaminiapp.entity.users;
import com.example.socialmediaminiapp.repository.UserRepository;
import com.example.socialmediaminiapp.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SocialMediaService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;

    // Post Operations
    public posts createPost(posts post) {
        return postRepository.save(post);
    }

    public List<posts> getPostsByHashtag(String hashtag) {
        return postRepository.findByHashtagsContaining(hashtag);
    }

    public List<posts> getPostsByAuthor(String authorId) {
        return postRepository.findByAuthorId(authorId);
    }

    // User Operations
    public users registerUser(users user) {
        return userRepository.save(user);
    }

    public Optional<users> getUserByUsername(String username) {
        return Optional.ofNullable(userRepository.findByUsername(username));
    }
}
