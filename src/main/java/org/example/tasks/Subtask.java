package org.example.tasks;

import java.util.HashMap;

public class Subtask extends Task {
    private int epicId;

    public Subtask(){}

    public Subtask(int id, String name, String description, int epicId, String status){
        super(id, name, description, status);
        this.epicId = epicId;
    }

    public int getEpicId() {
        return epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }
}
