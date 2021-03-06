package io.tech.department.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_department")
public class DepartmentEntity {
	
	@Id
	@Column(nullable = false) private int id;
	@Column(nullable = false) private String dapartmentName;
	@Column(nullable = false) private String departmentHOD;
	@Column(nullable = false) private String departmentDean;
	
}
