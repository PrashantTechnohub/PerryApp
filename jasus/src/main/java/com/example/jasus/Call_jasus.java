package com.example.jasus;

public class Call_jasus {
    String state,incomingnumber,date;

    public Call_jasus() {
    }

    public Call_jasus(String state, String incomingnumber, String date) {
        this.state = state;
        this.incomingnumber = incomingnumber;
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIncomingnumber() {
        return incomingnumber;
    }

    public void setIncomingnumber(String incomingnumber) {
        this.incomingnumber = incomingnumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

