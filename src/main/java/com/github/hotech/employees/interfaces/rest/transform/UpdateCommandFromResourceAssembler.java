package com.github.hotech.employees.interfaces.rest.transform;

import com.github.hotech.employees.domain.model.commands.UpdateEmployeeCommand;
import com.github.hotech.employees.interfaces.rest.resources.UpdateEmployeeResource;

public class UpdateCommandFromResourceAssembler {
    public static UpdateEmployeeCommand toUpdateCommand(Long employeeId,UpdateEmployeeResource resource){
        return new UpdateEmployeeCommand(
                employeeId,
                resource.email(),
                resource.salary(),
                CreateContractInformationFromResourceAssembler.toContractFromResource(resource.contractinformationResource())
,               resource.role()
        );

    }
}
