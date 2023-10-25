package test.microservice.departmentservice.mapper;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import test.microservice.departmentservice.dto.DepartmentDto;
import test.microservice.departmentservice.entity.Department;

@Component
@RequiredArgsConstructor
public class DepartmentMapper {
    private final ModelMapper mapper;

    public DepartmentDto mapToDepartmentDto(Department department){
        DepartmentDto departmentDto = mapper.map(department, DepartmentDto.class);
        return departmentDto;
    }

    public Department mapToDepartment(DepartmentDto departmentDto){
        Department department = mapper.map(departmentDto, Department.class);
        return department;
    }
}
