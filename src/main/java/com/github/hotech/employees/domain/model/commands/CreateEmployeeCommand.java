package com.github.hotech.employees.domain.model.commands;

import com.github.hotech.employees.domain.model.valueobjects.ContractInformation;

public record CreateEmployeeCommand(String firstName, String lastName,
                                    String phoneNumber,
                                    String email,
                                    Double salary,
                                    ContractInformation contractInformation,
                                    String role
) {
}
