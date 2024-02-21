package com.angularDemo.Employee.Dashboard.repositories;

import com.angularDemo.Employee.Dashboard.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    void deleteEmployeeById(int id);

    Employee findEmployeeById(int id);
}
