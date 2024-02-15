package ru.HomeWork4.HomeWork4.service;

import org.springframework.stereotype.Service;
import ru.HomeWork4.HomeWork4.domain.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee e) {
        employees.add(e);
    }
    public List<Employee> findAll(){
        return employees;
    }
}
