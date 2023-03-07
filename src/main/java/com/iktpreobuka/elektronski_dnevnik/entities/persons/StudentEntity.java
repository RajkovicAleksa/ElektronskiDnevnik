package com.iktpreobuka.elektronski_dnevnik.entities.persons;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "students")
@Getter
@Setter
public class StudentEntity extends PersonEntity {

	@ManyToOne
	private ParentEntity parent;
}