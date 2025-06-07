package com.github.hotech.employees.interfaces.rest.transform;

import com.github.hotech.employees.domain.model.commands.CreateEmployeeCommand;
import com.github.hotech.employees.interfaces.rest.resources.CreateEmployeeResource;

public class CreateEmployeeCommandFromResourceAssembler {
    public static CreateEmployeeCommand toCommandFromResource(CreateEmployeeResource resource){
        return new CreateEmployeeCommand(
                resource.firstName(),
                resource.lastName(),
                resource.phoneNumber(),
                resource.email(),
                resource.salary(),
                CreateContractInformationFromResourceAssembler.toContractFromResource(resource.contractInformationResource()),
                resource.role()
        );
    }
}
