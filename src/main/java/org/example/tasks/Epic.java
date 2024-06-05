package org.example.tasks;


import java.util.ArrayList;

public class Epic extends Task {
    private ArrayList<Integer> subtasksIds = new ArrayList<Integer>();


    public Epic(){}

    public Epic(int id, String name, String description, String status){
        super(id, name, description, status);
    }

    public ArrayList<Integer> getSubtasksIds() {
        return subtasksIds;
    }
}
