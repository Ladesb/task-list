package com.codurance.training.tasks;

import java.util.List;

public class Project {
    private String name;
    private List<Task> tasks;

    public Project(String name) {
        this.name = name;
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
}
