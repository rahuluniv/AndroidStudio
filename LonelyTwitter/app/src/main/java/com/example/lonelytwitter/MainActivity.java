package com.example.lonelytwitter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImportantTweet importantTweet = new ImportantTweet("hi everyone");
        importantTweet.setMessage("Hello!");

        NormalTweet normaltweet = new NormalTweet("I am Rahul");


        ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
        tweetList.add(normaltweet);
        tweetList.add(importantTweet);
    }
}