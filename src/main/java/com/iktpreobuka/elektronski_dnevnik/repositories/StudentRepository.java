package com.iktpreobuka.elektronski_dnevnik.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iktpreobuka.elektronski_dnevnik.entities.persons.StudentEntity;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity, Integer> {

	List<StudentEntity> getAllByIdIn(List<Integer> ids);
}
