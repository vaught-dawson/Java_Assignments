package dev.dawsonvaught.dojosandninjas.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dawsonvaught.dojosandninjas.models.Ninja;
import dev.dawsonvaught.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public ArrayList<Ninja> all() {
		return ninjaRepository.findAll();
	}
	
	public Ninja create(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	public Ninja find(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if (optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}
	
	public Ninja update(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	public void delete(long id) {
		ninjaRepository.deleteById(id);
	}
}