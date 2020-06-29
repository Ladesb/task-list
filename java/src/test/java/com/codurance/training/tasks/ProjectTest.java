package com.codurance.training.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProjectTest {

    @Test
    public void add_task_works() {
        //Given
        List<Task> tasks = new ArrayList<>();
        Project project = new Project("projet1", tasks);

        //When
        project.addTask("test");

        //Then
        Assert.assertEquals(1, project.getTasks().size());
    }
}
