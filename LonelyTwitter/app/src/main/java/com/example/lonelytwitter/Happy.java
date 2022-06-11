package com.example.lonelytwitter;

import java.util.Date;

public class Happy extends CurrentMood{ // inheritance

    private Happy(Date date) {
        super(date);
    }

    @Override
    public String toString() {
        return "Happy{}";
    }
}
