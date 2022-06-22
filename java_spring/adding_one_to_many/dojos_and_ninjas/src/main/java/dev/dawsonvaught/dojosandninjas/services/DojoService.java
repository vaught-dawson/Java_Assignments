package dev.dawsonvaught.dojosandninjas.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dawsonvaught.dojosandninjas.models.Dojo;
import dev.dawsonvaught.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {

	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public ArrayList<Dojo> all() {
		return dojoRepository.findAll();
	}
	
	public Dojo create(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	public Dojo find(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if (optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	
	public Dojo update(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	public void delete(long id) {
		dojoRepository.deleteById(id);
	}
}