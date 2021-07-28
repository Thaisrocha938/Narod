package br.com.faculdadejk.Narod.controllers;

import br.com.faculdadejk.Narod.models.Employee;
import br.com.faculdadejk.Narod.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/employee")
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/listar")
    public List<Employee> findAllEmployees(){

        return employeeService.findAll();
    }
}
