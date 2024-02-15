package ru.HomeWork4.HomeWork4.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.HomeWork4.HomeWork4.domain.Employee;
import ru.HomeWork4.HomeWork4.service.EmployeeService;

import java.util.List;

@Controller
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/employee")
    public String viewEmployee(Model model) {
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employee", employees);
        return "employee";
    }
}
