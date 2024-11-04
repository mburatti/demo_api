package me.buratti.employee.controller;

import me.buratti.demo_api.api.EmployeesApi;
import me.buratti.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController implements EmployeesApi {

    @Autowired
    private EmployeeService employeeService;
}