package com.angularDemo.Employee.Dashboard.services;

import com.angularDemo.Employee.Dashboard.exceptions.UserNotFoundException;
import com.angularDemo.Employee.Dashboard.model.Employee;
import com.angularDemo.Employee.Dashboard.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    private  EmployeeRepository employeeRepository;
    public Employee addEmployee(Employee employee){
        employee.setEmployeeNumber(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public void deleteEmployee(int id){
        employeeRepository.deleteEmployeeById(id);
    }
    public Employee findEmployeeById(int id){
        Employee employee = employeeRepository.findEmployeeById(id);
        if (employee == null){
            throw new UserNotFoundException("User by " + id + " is not found!!");
        }
        return employee;
    }
}
