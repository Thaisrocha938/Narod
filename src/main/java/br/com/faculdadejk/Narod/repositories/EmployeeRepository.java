package br.com.faculdadejk.Narod.repositories;

import br.com.faculdadejk.Narod.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
