package com.codurance.training.tasks;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private List<Task> tasks = new ArrayList<>();

    public Project(String name, List<Task> tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public Project(String name) {
        this.name = name;

    }

    public Project() {

    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    private long nextId() {
        return ++lastId;
    }
    private long lastId = 0;

    public void addTask(String description) {

        List<Task> projectTasks = getTasks();

        projectTasks.add(new Task(nextId(), description, false));
    }


}
