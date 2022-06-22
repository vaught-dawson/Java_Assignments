package dev.dawsonvaught.languages.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dawsonvaught.languages.models.Language;
import dev.dawsonvaught.languages.repositories.LanguageRepository;

@Service
public class LanguageService {

	private final LanguageRepository languageRepository;

	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	public ArrayList<Language> all() {
		return languageRepository.findAll();
	}

	public Language create(Language language) {
		return languageRepository.save(language);
	}

	public Language find(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}

	public Language update(Language language) {
		return languageRepository.save(language);
	}

	public void delete(long id) {
		languageRepository.deleteById(id);
	}
}