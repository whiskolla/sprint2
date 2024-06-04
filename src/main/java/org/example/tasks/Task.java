package org.example.tasks;

import java.util.HashMap;

public class Task {
    protected int id;
    protected String name;
    protected String description;
    protected String status;
    public String[] statuses = {"NEW", "IN_PROGRESS", "DONE"};


    public Task(){}

    public Task(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = statuses[0];
    }

}

