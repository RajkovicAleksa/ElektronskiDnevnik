package com.iktpreobuka.elektronski_dnevnik.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.iktpreobuka.elektronski_dnevnik.entities.persons.PersonEntity;
import com.iktpreobuka.elektronski_dnevnik.enums.ROLE;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String userName;
	@Column
	private String password;

	@Column
	@Enumerated(EnumType.STRING)
	private ROLE role;

	@OneToOne
	private PersonEntity person;
		
}