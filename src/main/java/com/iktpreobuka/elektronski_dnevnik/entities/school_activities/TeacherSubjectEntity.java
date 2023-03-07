package com.iktpreobuka.elektronski_dnevnik.entities.school_activities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.iktpreobuka.elektronski_dnevnik.entities.persons.TeacherEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="subjects")
@Getter
@Setter
public class TeacherSubjectEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String subjectName; //biologija

	@Column
	private Integer weeklyFond;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private TeacherEntity teacher;

	@OneToMany(mappedBy = "teacherSubject")
	private List<StudentClassEntity> studentClasses = new ArrayList<>();;
}
