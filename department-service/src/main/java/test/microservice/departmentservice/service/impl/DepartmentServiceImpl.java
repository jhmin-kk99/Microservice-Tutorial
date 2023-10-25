package test.microservice.departmentservice.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.microservice.departmentservice.dto.DepartmentDto;
import test.microservice.departmentservice.entity.Department;
import test.microservice.departmentservice.mapper.DepartmentMapper;
import test.microservice.departmentservice.repository.DepartmentRepository;
import test.microservice.departmentservice.service.DepartmentService;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;
    private DepartmentMapper mapper;
    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        Department department = mapper.mapToDepartment(departmentDto);
        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto savedDepartmentDto = mapper.mapToDepartmentDto(savedDepartment);

        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {
        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        DepartmentDto departmentDto = mapper.mapToDepartmentDto(department);
        return departmentDto;
    }
}
