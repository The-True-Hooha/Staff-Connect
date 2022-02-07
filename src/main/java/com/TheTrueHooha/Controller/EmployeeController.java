package com.TheTrueHooha.Controller;
//the controller responds created the api endpoint for the http status codes

import com.TheTrueHooha.Model.Employee;
import com.TheTrueHooha.Service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    //a constructor for the employee service controller
    public EmployeeController (EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    // a post API that creates employee into the database
    @PostMapping //handles post http request
    public ResponseEntity<Employee> saveEmployee( @RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),
                HttpStatus.CREATED);
    }

    //GET method to get all the employees from the database
    @GetMapping
    public List <Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    //GET method to get the employee by ID
    @GetMapping ("{id}")
    public ResponseEntity <Employee> getEmloyeeById(@PathVariable ("id") long employeeId) {
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);

    }


    //PUT request for employee to update profile
    @PutMapping ("{id}")
    public ResponseEntity <Employee> updateEmployee
    (@PathVariable ("id") long id, @RequestBody Employee employee) {

        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
    }

    //DELETE request method for employee data


}
