package com.codurance.training.tasks.action;

import com.codurance.training.tasks.Project;
import com.codurance.training.tasks.Task;

import java.util.List;

public class Show {

    public void show(List<Project> projects) {
        for (Project project : projects) {
            System.out.println(project.getName());
            for (Task task : project.getTasks()) {
                System.out.println("    " + (task.isDone() ? "[x]" : "[ ]" ) + " " + task.getId() + " "  + task.getDescription());
            }
            System.out.println();
        }
    }

}
