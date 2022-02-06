package com.TheTrueHooha.Model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data //lombok annotation to reduce boiler code
@Entity // specifies that the class "Employee" is an entity
@Table(name = "employee") //table name with annotation and property name

public class Employee {

    @Id // generates an ID for the entity created for the "Employee" class
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private long employeeId;

    @Column (name = "firstName", nullable = false)
    private String firstName;

    @Column (name = "lastName")
    private String lastName;

    @Column (name = "email")
    private String email;
}
