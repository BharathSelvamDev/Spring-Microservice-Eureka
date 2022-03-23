package io.tech.student.model;

import io.tech.student.entity.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDepartmentVO {
	
	private StudentEntity studentEntity;
	private DepartmentModel departmentModel;
}
