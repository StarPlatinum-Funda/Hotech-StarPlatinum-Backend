package com.github.hotech.task.interfaces.rest.resources;

public record GetAllTaskFromDatesForEmployeeResource(
        String employeeEmail,
        String startDate,
        String endDate
) {
}
