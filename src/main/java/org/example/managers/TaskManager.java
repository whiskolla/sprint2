package org.example.managers;

import org.example.tasks.Epic;
import org.example.tasks.Subtask;
import org.example.tasks.Task;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager implements Manager {
    int doneSt = 0;
    int newSt = 0;
    boolean ifInProgress = false;
    protected ArrayList<Task> tasks = new ArrayList<>();
    protected ArrayList<Subtask> subtasks = new ArrayList<>();
    protected ArrayList<Epic> epics = new ArrayList<>();


    @Override
    public void addTask(Task newTask) {
        tasks.add(newTask);
    }

    @Override
    public void addEpic(Epic newTask) {
        epics.add(newTask);
    }

    @Override
    public void addSubtask(Subtask newTask) {
        subtasks.add(newTask);
    }

    @Override
    public void deleteAllTasks() {
        tasks.clear();
        subtasks.clear();
        epics.clear();
    }

    @Override
    public void deleteTask(int id) {
        tasks.remove(id);
    }

    @Override
    public void deleteSubtask(int id) {
        subtasks.remove(id);
    }

    @Override
    public void deleteEpic(int id) {
        epics.remove(id);
    }

    @Override
    public ArrayList<Subtask> getListOfSubtasks() {
        return subtasks;
    }

    @Override
    public ArrayList<Subtask> getListOfSubtasks(int epicId) {
        ArrayList<Subtask> temps = new ArrayList<Subtask>();
        subtasks.forEach(st -> {
            if(st.getEpicId() == epicId)
                temps.add(st);
        });
        return temps;
    }

    @Override
    public ArrayList<Epic> getListOfEpics() {
        return epics;
    }

    @Override
    public ArrayList<Task> getListOfTasks() {
        return tasks;
    }

    @Override
    public void getTask(int id) {
        tasks.get(id);
    }

    @Override
    public void getEpic(int id) {
        epics.get(id);
    }

    @Override
    public void getSubtask(int id) {
        subtasks.get(id);
    }

    @Override
    public void updateTask(int id, Task newTask) {
        tasks.remove(id);
        tasks.add(id, newTask);
    }

    @Override
    public void updateSubtask(int id, Subtask newTask) {
        subtasks.remove(id);
        subtasks.add(id, newTask);
    }

    @Override
    public void updateEpic(int id, Epic newTask) {
        epics.remove(id);
        epics.add(id, newTask);
    }

    @Override
    public void ifChangeEpicStatus(int epiqId) {
        newSt = 0;
        doneSt = 0;
        ifInProgress = false;
        ArrayList<Subtask> temp = getListOfSubtasks(epiqId);
        temp.forEach(st -> {
            switch(st.getStatus()) {
                case("NEW"):
                    newSt++;
                    break;
                case("DONE"):
                    doneSt++;
                    break;
                case("IN_PROGRESS"):
                    ifInProgress = true;
                    break;
            }
        });
        if(ifInProgress == false) {
            if (newSt == temp.size())
                epics.get(epiqId).setStatus("NEW");
            if (doneSt == temp.size())
                epics.get(epiqId).setStatus("DONE");
        }
    }
}
