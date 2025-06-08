package com.github.hotech.shared.application.internal.outboundedservices.acl;

import com.github.hotech.employees.interfaces.acl.EmployeeContextFacade;
import com.github.hotech.task.domain.model.valueobjects.EmployeeIdentifier;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ExternalEmployeeService {

    private final EmployeeContextFacade employeeContextFacade;
    private final ExternalProfileService externalProfileService;


    public Optional<EmployeeIdentifier> fetchEmployeeIdentifierByEmail(String email) {
        var profileID = externalProfileService.fetchProfileIdByEmail(email);
        if (profileID.isEmpty()) return Optional.empty();
        var employeeId = employeeContextFacade.fetchEmployeeIdByProfileId(profileID.get().profileId());
        if (employeeId == 0L) return Optional.empty();
        return Optional.of(new EmployeeIdentifier(employeeId));
    }
}
