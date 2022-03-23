package io.tech.student.model;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_department")
public class DepartmentModel {

	private int id;
	private String dapartmentName;
	private String departmentHOD;
	private String departmentDean;

}
