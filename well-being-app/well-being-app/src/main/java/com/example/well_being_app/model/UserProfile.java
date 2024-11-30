package com.example.well_being_app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;


@Document(collection = "user_profiles")
public class UserProfile {
    @Id
    private String id;

    private String name;
    private Stri
}
