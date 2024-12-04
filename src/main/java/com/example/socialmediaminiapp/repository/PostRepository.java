package com.example.socialmediaminiapp.repository;

import com.example.socialmediaminiapp.entity.posts;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<posts, String> {
    List<posts> findByHashtagsContaining(String hashtag);
    List<posts> findByAuthorId(String authorId);
}
