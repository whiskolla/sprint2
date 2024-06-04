package org.example.tasks;

import java.util.HashMap;

public class Subtask extends Task {
    private int id;
    private int epicId;
    private String name;
    private String description;
    private String status;
    public String[] statuses = {"NEW", "IN_PROGRESS", "DONE"};


    public Subtask(){}

    public Subtask(int id, String name, String description, int epicId, String status){
        super(id, name, description, status);
        this.epicId = epicId;
    }
}
