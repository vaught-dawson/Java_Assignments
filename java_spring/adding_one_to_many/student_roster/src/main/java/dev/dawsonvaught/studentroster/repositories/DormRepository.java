package dev.dawsonvaught.studentroster.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.dawsonvaught.studentroster.models.Dorm;

@Repository
public interface DormRepository extends CrudRepository<Dorm, Long>{
    ArrayList<Dorm> findAll();
}