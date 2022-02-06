package com.TheTrueHooha.Repository;

import com.TheTrueHooha.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//jpa repo  boiler code created from the employee class
public interface employeeRepository extends JpaRepository <Employee, Long> {
}
