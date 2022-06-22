package dev.dawsonvaught.dojosandninjas.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.dawsonvaught.dojosandninjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{
    ArrayList<Ninja> findAll();
}