package io.tech.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.tech.department.entity.DepartmentEntity;
import io.tech.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/get/{id}")
	public DepartmentEntity GetDepartmentByID(@PathVariable int id) {
		return departmentService.GetDepartmentByID(id);
	}
	
	@PostMapping("/add")
	public DepartmentEntity AllDepartment(@RequestBody DepartmentEntity department) {
		return departmentService.SaveDepartment(department);
	}
	
}
