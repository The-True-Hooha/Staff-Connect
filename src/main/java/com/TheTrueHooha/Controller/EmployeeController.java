package com.TheTrueHooha.Controller;
//the controller responds created the api endpoint for the http status codes

import com.TheTrueHooha.Model.Employee;
import com.TheTrueHooha.Service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    //a constructor for the employee service controller
    public EmployeeController (EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    //creates employee rest api
    @PostMapping //handles post http request
    public ResponseEntity<Employee> saveEmployee( @RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }
}
