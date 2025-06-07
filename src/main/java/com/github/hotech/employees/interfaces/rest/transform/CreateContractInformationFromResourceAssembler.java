package com.github.hotech.employees.interfaces.rest.transform;

import com.github.hotech.employees.domain.model.valueobjects.ContractInformation;
import com.github.hotech.employees.interfaces.rest.resources.ContractInformationResource;

public class CreateContractInformationFromResourceAssembler {

    public static ContractInformation toContractFromResource(ContractInformationResource resource){

        return new ContractInformation(resource.initationDate(),resource.terminationDate());
    }
}
