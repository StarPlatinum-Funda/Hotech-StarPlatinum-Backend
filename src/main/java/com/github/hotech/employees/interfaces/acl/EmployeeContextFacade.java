package com.github.hotech.employees.interfaces.acl;

import com.github.hotech.employees.domain.model.queries.GetEmployeeByProfileIdQuery;
import com.github.hotech.employees.domain.services.EmployeeQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by Alex Avila Asto - A.K.A (Ryzeon)
 * Project: inncontrol-backend
 * Date: 6/21/24 @ 08:05
 */
@Service
@AllArgsConstructor
public class EmployeeContextFacade {

    private final EmployeeQueryService  employeeQueryService;


    public Long fetchEmployeeIdByProfileId(Long profileId) {
        var query = new GetEmployeeByProfileIdQuery(profileId);
        var employee = employeeQueryService.handle(query);
        if (employee.isEmpty()) return 0L;
        return employee.get().getId();
    }
}
