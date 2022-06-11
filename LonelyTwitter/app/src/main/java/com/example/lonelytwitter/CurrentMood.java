package com.example.lonelytwitter;

import java.util.Date;

public abstract class CurrentMood { // abstraction
    private Date date; // encapsulation

    private Date getDate() {
        return date;
    }

    private void setDate(Date date) {
        this.date = date;
    }

    public CurrentMood(Date date) { // a constructor which takes a date as an argument

        this.date = new Date();
    }

    public CurrentMood(){ //A constructor which sets the date to a default
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "CurrentMood{" +
                "date=" + date +
                '}';
    }
}
