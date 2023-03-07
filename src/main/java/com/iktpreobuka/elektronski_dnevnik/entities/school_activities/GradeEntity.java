package com.iktpreobuka.elektronski_dnevnik.entities.school_activities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.iktpreobuka.elektronski_dnevnik.entities.persons.StudentEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "grades")
@Getter
@Setter
public class GradeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	@Min(1)
	@Max(5)
	private Integer mark;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private SemesterEntity semester;
	
	@ManyToOne
	private StudentEntity student;

}