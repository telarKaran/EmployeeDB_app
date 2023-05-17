package com.employee.empApp.employee;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  private List<Employee> employees = new ArrayList<>();
  private Long nextId = 1L;
  
  
  
  EmployeeService(){
	
  }
  

  public List<Employee> getAllEmployees() {
    return employees;
  }

  public Employee getEmployeeById(Long id) {
    for (Employee employee : employees) {
      if (employee.getId().equals(id)) {
        return employee;
      }
    }
    return null;
  }

  public Employee addEmployee(Employee employee) {
    employee.setId(nextId++);
    employees.add(employee);
    return employee;
  }

  public Employee updateEmployee(Long id, Employee employee) {
    for (int i = 0; i < employees.size(); i++) {
      if (employees.get(i).getId().equals(id)) {
        employee.setId(id);
        employees.set(i, employee);
        return employee;
      }
    }
    return null;
  }

  public boolean deleteEmployee(Long id) {
    for (int i = 0; i < employees.size(); i++) {
      if (employees.get(i).getId().equals(id)) {
        employees.remove(i);
        return true;
      }
    }
    return false;
  }
}