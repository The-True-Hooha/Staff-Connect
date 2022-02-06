package com.TheTrueHooha.Service.Impl;

import com.TheTrueHooha.Exception.ResourceNotFoundException;
import com.TheTrueHooha.Model.Employee;
import com.TheTrueHooha.Repository.EmployeeRepository;
import com.TheTrueHooha.Service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    //impl that return all the employees
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    //impl that return all the employee by ID
    @Override
    public Employee getEmployeeById(long Id) {
       Optional <Employee>  employee = employeeRepository.findById(Id);
       if (employee.isPresent()) {
           return employee.get();
        }
        else {
          throw new ResourceNotFoundException("Employee", "Id", Id);
        }


         //another method to use (lambda expression)
        /**
         return employeeRepository.findById(Id).orElseThrow(() ->
                 new ResourceNotFoundException("Employee", "Id", Id));
         **/
    }



}
