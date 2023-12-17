package com.shyam.springBoot.service;

import com.shyam.springBoot.entity.Department;
import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();
}
