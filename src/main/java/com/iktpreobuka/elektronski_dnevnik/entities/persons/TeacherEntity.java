package com.iktpreobuka.elektronski_dnevnik.entities.persons;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.iktpreobuka.elektronski_dnevnik.entities.school_activities.TeacherSubjectEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "teachers")
@Getter
@Setter
public class TeacherEntity extends PersonEntity {

	@OneToMany(mappedBy = "teacher")
	private List<TeacherSubjectEntity> teacherSubjects = new ArrayList<>();
}