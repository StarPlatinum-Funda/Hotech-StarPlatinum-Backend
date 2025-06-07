package com.github.hotech.employees.interfaces.rest.resources;

import com.github.hotech.employees.domain.model.valueobjects.Role;

import java.util.Date;

public record EmployeeResource(
        Long employeeId,
        Role role,
        Double salary,
        Date initiationContract,
        Date terminationContract,
        Long profileId
) {
}
