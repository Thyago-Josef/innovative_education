package com.education.innovative_education.repository;


import com.education.innovative_education.entities.Turma;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends CrudRepository<Turma, Long> {

}
