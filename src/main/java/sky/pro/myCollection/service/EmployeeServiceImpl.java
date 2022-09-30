package sky.pro.myCollection.service;
import org.springframework.stereotype.Service;
import sky.pro.myCollection.Employee;
import sky.pro.myCollection.exception.EmployeeAlreadyAddedException;
import sky.pro.myCollection.exception.EmployeeNotFoundException;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl {
    List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(String name, String surName) {
        Employee employee = new Employee(name, surName);
        if (employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException("сотрудник уже добавлен");
        } else {
            employees.add(employee);
            return employee;
        }
    }
    public void deleteEmployee(String name, String surName) {
        Employee employee = new Employee(name, surName);
        if (!employees.contains(employee)) {
            throw new EmployeeAlreadyAddedException("удаляемый сотрудник не найден");
        } else {
            employees.remove(employee);
        }
    }
    public Employee searchEmployee(String name, String surName) {
        Employee employee = new Employee(name, surName);
        if (employees.contains(employee)) {
            return employee;
        }
        throw new EmployeeNotFoundException("сотрудник не найден");
    }



}
