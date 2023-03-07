package com.iktpreobuka.elektronski_dnevnik.entities.persons;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "persons")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public class PersonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;

	@Column
	private String name;

	@Column
	private String surName;
}