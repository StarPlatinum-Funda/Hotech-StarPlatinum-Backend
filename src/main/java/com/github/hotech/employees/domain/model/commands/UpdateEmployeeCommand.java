package com.github.hotech.employees.domain.model.commands;

import com.github.hotech.employees.domain.model.valueobjects.ContractInformation;
import com.github.hotech.employees.domain.model.valueobjects.Role;

public record  UpdateEmployeeCommand(Long id, String email, Double salary,
                                    ContractInformation contractInformation, Role role) {
}
