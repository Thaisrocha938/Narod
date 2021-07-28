package br.com.faculdadejk.Narod.services;

import br.com.faculdadejk.Narod.models.Employee;
import br.com.faculdadejk.Narod.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll(){

        return employeeRepository.findAll();
    }
}
