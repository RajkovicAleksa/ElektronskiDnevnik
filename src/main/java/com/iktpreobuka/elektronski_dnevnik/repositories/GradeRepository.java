package com.iktpreobuka.elektronski_dnevnik.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iktpreobuka.elektronski_dnevnik.entities.persons.StudentEntity;
import com.iktpreobuka.elektronski_dnevnik.entities.school_activities.GradeEntity;

@Repository
public interface GradeRepository extends CrudRepository<GradeEntity, Integer>{

	List<GradeEntity> findAllByStudentId(Integer studentId);

	List<GradeEntity> findAllByStudentIdAndMark(Integer studentId, Integer mark);

	List<GradeEntity> findAllByStudentIn(List<StudentEntity> students);

	List<GradeEntity> findAllByStudentInAndMark(List<StudentEntity> students, Integer mark);
}