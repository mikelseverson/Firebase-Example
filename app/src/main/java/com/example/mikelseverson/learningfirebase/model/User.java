package com.example.mikelseverson.learningfirebase.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by mikelseverson on 5/29/16.
 */

// [START blog_user_class]
@IgnoreExtraProperties
public class User {

    public String username;
    public String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

}
// [END blog_user_class]