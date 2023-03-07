package com.iktpreobuka.elektronski_dnevnik.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iktpreobuka.elektronski_dnevnik.entities.school_activities.SemesterEntity;

@Repository
public interface SemesterRepository extends CrudRepository<SemesterEntity, Integer> {
}