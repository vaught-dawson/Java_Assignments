package dev.dawsonvaught.studentroster.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.dawsonvaught.studentroster.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
    ArrayList<Student> findAll();
}