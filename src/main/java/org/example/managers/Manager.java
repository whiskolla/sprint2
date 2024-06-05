package org.example.managers;

import org.example.tasks.Epic;
import org.example.tasks.Subtask;
import org.example.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;

public interface Manager {

    //add
    public void addTask(Task newTask);
    public void addEpic(Epic newTask);
    public void addSubtask(Subtask newTask);

    //delete
    public void deleteAllTasks();
    public void deleteTask(int id);
    public void deleteSubtask(int id);
    public void deleteEpic(int id);

    //get all
    public ArrayList<Subtask> getListOfSubtasks();
    public ArrayList<Subtask> getListOfSubtasks(int epicId);
    public ArrayList<Epic> getListOfEpics();
    public ArrayList<Task> getListOfTasks();

    //get one
    public void getTask(int id);
    public void getEpic(int id);
    public void getSubtask(int id);

    //update
    public void updateTask(int id, Task newTask);
    public void updateSubtask(int id, Subtask newTask);
    public void updateEpic(int id, Epic newTask);

    public void ifChangeEpicStatus(int epiqId);
}
