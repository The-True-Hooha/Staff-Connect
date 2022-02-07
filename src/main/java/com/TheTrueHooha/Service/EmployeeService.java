package com.TheTrueHooha.Service;

import com.TheTrueHooha.Model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee (Employee employee);

    //method that returns the list fof employees
    List <Employee> getAllEmployees();

    //method that return the employee but by ID
    Employee getEmployeeById (long Id);

    //method that returns the employee object
    Employee updateEmployee (Employee employee, long id);

    //method for delete employee data
    void deleteEmployee (long id);
}
