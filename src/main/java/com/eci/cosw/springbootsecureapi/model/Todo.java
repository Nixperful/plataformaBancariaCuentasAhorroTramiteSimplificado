package com.eci.cosw.springbootsecureapi.model;

import java.util.Date;

public class Todo {



    private String text;

    private Integer priority;

    private Date dueDate;


    public Todo(String text, Integer priority, Date dueDate) {
        this.text = text;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getText() {
        return text;
    }

    public Integer getPriority() {

        return priority;
    }

    public Date getDueDate() {
        return dueDate;
    }
}

