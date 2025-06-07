package com.github.hotech.employees.interfaces.rest.resources;

import com.github.hotech.employees.domain.model.valueobjects.Role;

public record  UpdateEmployeeResource(
                                     String email,
                                     Double salary,
                                     ContractInformationResource contractinformationResource,
                                     Role role) {
}
