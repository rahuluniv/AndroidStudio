package com.example.lonelytwitter;

import java.util.Date;

public class Sad extends CurrentMood{ // inheritance

    private Sad(Date date) {
        super(date);
    }

    @Override
    public String toString() {
        return "Sad{}";
    }
}
