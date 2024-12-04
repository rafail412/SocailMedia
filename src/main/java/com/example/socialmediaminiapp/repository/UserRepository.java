package com.example.socialmediaminiapp.repository;

import com.example.socialmediaminiapp.entity.users;
import com.example.socialmediaminiapp.entity.posts;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<users, String> {
    users findByUsername(String username);
}
