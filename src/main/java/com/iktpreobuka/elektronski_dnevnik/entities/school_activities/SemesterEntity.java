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

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "semesters")
@Getter
@Setter
public class SemesterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String name;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	private StudentClassEntity studentClass;

	@OneToMany(mappedBy = "semester")
	private List<GradeEntity> grades = new ArrayList<>();
}