package com.github.hotech.employees.domain.services;

import com.github.hotech.employees.domain.model.aggregates.Employee;
import com.github.hotech.employees.domain.model.queries.GetAllEmployeeQuery;
import com.github.hotech.employees.domain.model.queries.GetEmployeeByIdQuery;
import com.github.hotech.employees.domain.model.queries.GetEmployeeByProfileIdQuery;
import com.github.hotech.employees.domain.model.queries.GetEmployeeByRoleStatus;

import java.util.List;
import java.util.Optional;

public interface  EmployeeQueryService {

    List<Employee>handle(GetAllEmployeeQuery query);
    Optional<Employee> handle(GetEmployeeByIdQuery query);
    Optional<Employee> handle(GetEmployeeByRoleStatus query);
    Optional<Employee> handle(GetEmployeeByProfileIdQuery query);
}
