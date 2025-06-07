package com.github.hotech.task.interfaces.rest.transforms;

import com.github.hotech.task.domain.model.commands.CreateTaskCommand;
import com.github.hotech.task.interfaces.rest.resources.TaskCreateCommandResource;

import java.time.Instant;
import java.util.Date;

public class CreateTaskCommandFromResourceAssembler {

    private static Date parseDate(String date) {
        return Date.from(Instant.parse(date));
    }

    public static CreateTaskCommand toCommandFromResource(TaskCreateCommandResource resource) {

        return new CreateTaskCommand(
                resource.title(),
                resource.description(),
                resource.employeeEmail(),
                parseDate(resource.dueDate())
        );
    }
}
