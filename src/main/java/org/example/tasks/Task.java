package org.example.tasks;

import java.util.HashMap;

public class Task {
    protected int id;
    protected String name;
    protected String description;
    protected String status;

    public Task(){}

    public Task(int id, String name, String description, String status){
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString(){
        return "name: " + this.name + "\ndescription:" + this.description + "\nstatus:" + this.status;
    }
}

