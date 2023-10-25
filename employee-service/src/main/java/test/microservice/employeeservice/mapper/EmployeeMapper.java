package test.microservice.employeeservice.mapper;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import test.microservice.employeeservice.dto.EmployeeDto;
import test.microservice.employeeservice.entity.Employee;

@Component
@RequiredArgsConstructor
public class EmployeeMapper {
    private final ModelMapper mapper;

    public EmployeeDto mapToEmployeeDto(Employee employee){
        return mapper.map(employee, EmployeeDto.class);
    }

    public Employee mapToEmployee(EmployeeDto employeeDto){
        return mapper.map(employeeDto, Employee.class);
    }

}
