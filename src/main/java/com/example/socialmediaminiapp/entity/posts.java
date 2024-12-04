package com.example.socialmediaminiapp.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "posts")
public class posts {
    @Id
    private String id;
    private String content;
    private String authorId;
    private List<String> hashtags;
    private LocalDateTime createdAt;

    // Getters and Setters
}