package org.example;

import org.example.tasks.Task;
import java.util.ArrayList;

public class Manager {
    ArrayList<Task> tasks = new ArrayList<>();


    public void getListOfTasks(){
        for(Task i : tasks){
            i.toString();
        }
    }

    public void deleteListOfTasks(){
            tasks.clear();
    }

    public void takeOneOfTasks(int id){
        for(Task i : tasks){
            if(i.getId() == id)
                i.toString();
        }
    }

    public void addOneOfTasks(Task newTask){
        tasks.add(newTask);
    }

    public void deleteOneOfTasks(int id){
        tasks.remove(id);
    }

    public void changeOneOfTasks(int id, Task newTask){
        for(Task i : tasks) {
            if(i.getId() == id){
                i.setDescription(newTask.getDescription());
                i.setName(newTask.getName());
                i.setStatus(newTask.getStatus());
            }
        }
    }

}
