package test.microservice.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.microservice.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
