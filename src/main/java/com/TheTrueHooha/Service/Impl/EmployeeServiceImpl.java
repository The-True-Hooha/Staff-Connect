package com.TheTrueHooha.Service.Impl;

import com.TheTrueHooha.Model.Employee;
import com.TheTrueHooha.Repository.EmployeeRepository;
import com.TheTrueHooha.Service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
