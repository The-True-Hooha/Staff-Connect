package com.TheTrueHooha.Service.Impl;

import com.TheTrueHooha.Model.Employee;
import com.TheTrueHooha.Repository.EmployeeRepository;
import com.TheTrueHooha.Service.EmployeeService;
import org.springframework.stereotype.Service;

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
}
