package com.angularDemo.Employee.Dashboard.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String position;

    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String employeeNumber;

}
