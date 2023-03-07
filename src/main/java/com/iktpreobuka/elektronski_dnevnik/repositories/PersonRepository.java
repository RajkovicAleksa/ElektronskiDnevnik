package com.iktpreobuka.elektronski_dnevnik.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iktpreobuka.elektronski_dnevnik.entities.persons.PersonEntity;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Integer> {
	
}
