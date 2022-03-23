package io.tech.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.tech.student.entity.StudentEntity;
import io.tech.student.model.StudentDepartmentVO;
import io.tech.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/get/{id}")
	public StudentDepartmentVO GetStudentByIDWithDepartment(@PathVariable int id) {
		return studentService.GetStudentByIDWithDepartment(id);
	}
	
	@PostMapping("/add")
	public StudentEntity AllDepartment(@RequestBody StudentEntity student) {
		return studentService.SaveStudent(student);
	}

}
