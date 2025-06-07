package com.github.hotech.task.interfaces.rest.transforms;

import com.github.hotech.task.domain.model.queries.GetAllTaskInWeekForEmployeeQuery;
import com.github.hotech.task.interfaces.rest.resources.GetAllTaskInWeekForEmployeeResource;

public class GetAllTasksInWeekForEmployeeQueryFromResourceAssembler {

    public static GetAllTaskInWeekForEmployeeQuery toQueryFromResource(GetAllTaskInWeekForEmployeeResource resource) {
        return new GetAllTaskInWeekForEmployeeQuery(
                resource.employeeEmail()
        );
    }
}
