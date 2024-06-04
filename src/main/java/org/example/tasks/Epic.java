package org.example.tasks;


import java.util.ArrayList;

public class Epic extends Task {

    boolean ifCheck = false;
    private int id;
    private String name;
    private String description;
    private String status;
    private ArrayList<Subtask> subtasks = new ArrayList<Subtask>();


    public Epic(){}

    public Epic(int id, String name, String description, String status){
        super(id, name, description, status);
    }





    public boolean checkIfNoActiveTasks() {
        for(Subtask i : subtasks) {
            if(i.getStatus().equals("DONE")){
                ifCheck = true;
            } else {
                ifCheck = false;
                return ifCheck;
            }
        }
        return ifCheck;
    }
}
