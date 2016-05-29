package com.example.mikelseverson.learningfirebase.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by mikelseverson on 5/29/16.
 */

// [START comment_class]
@IgnoreExtraProperties
public class Comment {

    public String uid;
    public String author;
    public String text;

    public Comment() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public Comment(String uid, String author, String text) {
        this.uid = uid;
        this.author = author;
        this.text = text;
    }

}
// [END comment_class]