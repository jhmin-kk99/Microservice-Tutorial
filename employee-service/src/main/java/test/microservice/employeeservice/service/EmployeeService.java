package test.microservice.employeeservice.service;

import test.microservice.employeeservice.dto.APIResponseDto;
import test.microservice.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long employeeId);
}
