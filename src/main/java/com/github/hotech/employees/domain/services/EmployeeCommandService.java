package com.github.hotech.employees.domain.services;


import com.github.hotech.employees.domain.model.aggregates.Employee;
import com.github.hotech.employees.domain.model.commands.AscendEmployeeCommand;
import com.github.hotech.employees.domain.model.commands.CreateEmployeeCommand;
import com.github.hotech.employees.domain.model.commands.DowngradeEmployeeCommand;
import com.github.hotech.employees.domain.model.commands.UpdateEmployeeCommand;

import java.util.Optional;

public interface  EmployeeCommandService {
    Long handle(CreateEmployeeCommand command);
    Optional<Employee>handle(UpdateEmployeeCommand command);
    Long handle(DowngradeEmployeeCommand command);
    Long handle(AscendEmployeeCommand command);

}
