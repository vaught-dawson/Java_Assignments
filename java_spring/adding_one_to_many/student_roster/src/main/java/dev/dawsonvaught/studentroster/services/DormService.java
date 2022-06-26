package dev.dawsonvaught.studentroster.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dawsonvaught.studentroster.models.Dorm;
import dev.dawsonvaught.studentroster.repositories.DormRepository;

@Service
public class DormService {

	private final DormRepository dormRepository;
	
	public DormService(DormRepository dormRepository) {
		this.dormRepository = dormRepository;
	}
	
	public ArrayList<Dorm> all() {
		return dormRepository.findAll();
	}
	
	public Dorm create(Dorm dorm) {
		return dormRepository.save(dorm);
	}
	
	public Dorm find(Long id) {
		Optional<Dorm> optionalDorm = dormRepository.findById(id);
		if (optionalDorm.isPresent()) {
			return optionalDorm.get();
		} else {
			return null;
		}
	}
	
	public Dorm update(Dorm dorm) {
		return dormRepository.save(dorm);
	}
	
	public void deleteById(long id) {
		dormRepository.deleteById(id);
	}
}