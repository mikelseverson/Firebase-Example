package com.example.mikelseverson.learningfirebase.fragment;

/**
 * Created by mikelseverson on 5/29/16.
 */


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyPostsFragment extends PostListFragment {

    public MyPostsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        String myUserId = getUid();
        // All my posts
        return databaseReference.child("user-posts")
                .child(myUserId);
    }
}