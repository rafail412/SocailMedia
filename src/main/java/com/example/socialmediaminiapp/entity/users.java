package com.example.socialmediaminiapp.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;
    @Document(collection = "users")
    public class users {
        @Id
        private String id;
        private String username;
        private String email;
        private List<String> followers;
        private List<String> following;

    }
