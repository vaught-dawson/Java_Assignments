package dev.dawsonvaught.languages.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.dawsonvaught.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {
	ArrayList<Language> findAll();
}