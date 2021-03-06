package io.tech.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.tech.student.entity.StudentEntity;
import io.tech.student.model.DepartmentModel;
import io.tech.student.model.StudentDepartmentVO;
import io.tech.student.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	public StudentDepartmentVO GetStudentByIDWithDepartment(int id) {
		StudentEntity student = studentRepo.findById(id).get();
		DepartmentModel department =  restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/get/"+student.getDepartmentID(), DepartmentModel.class);
		return new StudentDepartmentVO(student , department);
		
		
	}

	public StudentEntity SaveStudent(StudentEntity student) {
		return studentRepo.save(student);
	}

}
