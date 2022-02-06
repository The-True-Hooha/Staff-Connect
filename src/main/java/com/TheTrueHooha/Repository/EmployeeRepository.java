package com.TheTrueHooha.Repository;

import com.TheTrueHooha.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//jpa repo  boiler code created from the employee class
public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
