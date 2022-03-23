package io.tech.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_student")
public class StudentEntity {
	@Id
	@Column(nullable = false)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String departmentID;
	@Column(nullable = false)
	private String city;
}
