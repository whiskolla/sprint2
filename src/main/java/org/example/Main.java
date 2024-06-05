package org.example;

import org.example.tasks.Epic;
import org.example.tasks.Subtask;
import org.example.tasks.Task;
import org.example.managers.TaskManager;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Task task1 = new Task(1,"Practice", "Not just first time. But the best time.", "NEW");
        Task task2 = new Task(2,"Work", "Do the best you can.", "NEW");
        Epic epic1 = new Epic(1,"Sport", "Doing it every day and everything will be fine.", "NEW");
        Epic epic2 = new Epic(2,"Easy", "Doing it and everything will be ok.", "NEW");
        Subtask subtask1 = new Subtask(1,"Inside", "In the house.", 1, "NEW");
        Subtask subtask2 = new Subtask(2,"Outside", "Outside the house.", 1, "NEW");
        Subtask subtask3 = new Subtask(2,"GetUP", "Too complicated.", 2, "NEW");

        taskManager.addEpic(epic1);
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addSubtask(subtask1);
        taskManager.addSubtask(subtask2);
        System.out.println(taskManager);

        epic1.setStatus("IN_PROGRESS");
        taskManager.updateEpic(1, epic1);

        System.out.println("------------------------------");
        System.out.println(taskManager);



    }
}