package com.iktpreobuka.elektronski_dnevnik.entities.persons;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@Entity
@Table(name="parents")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ParentEntity extends PersonEntity {

	@Column
	private String email;

	@JsonIgnore
	@OneToMany
	private List<StudentEntity> students;
}