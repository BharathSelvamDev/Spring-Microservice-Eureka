package io.tech.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.tech.department.entity.DepartmentEntity;
import io.tech.department.repo.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	public DepartmentEntity GetDepartmentByID(int id) {
		return departmentRepo.findById(id).get();
	}

	public DepartmentEntity SaveDepartment(DepartmentEntity department) {
		return departmentRepo.save(department);
	}

}
