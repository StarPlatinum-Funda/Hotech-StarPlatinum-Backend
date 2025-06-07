package com.github.hotech.task.domain.model.queries;

import java.util.Date;

public record GetAllTaskFromDatesForEmployeeQuery(
        String employeeEmail,
        Date startDate,
        Date endDate
) {
}
