package test.microservice.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.microservice.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Department findByDepartmentCode(String departmentCode);
}
