package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

public class Todo {



    private String text;

    private String priority;

    private Date dueDate;


    public Todo(String text, String priority, Date dueDate) {
        this.text = text;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getText() {
        return text;
    }

    public String getPriority() {
        return priority;
    }

    public Date getDueDate() {
        return dueDate;
    }
}

