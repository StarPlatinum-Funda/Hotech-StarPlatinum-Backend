package com.github.hotech.employees.interfaces.rest.resources;


public record  CreateEmployeeResource(String firstName,
                                      String lastName,
                                      String phoneNumber,
                                      String email,
                                        Double salary,
                                      ContractInformationResource contractInformationResource,
                                        String role
) {
}