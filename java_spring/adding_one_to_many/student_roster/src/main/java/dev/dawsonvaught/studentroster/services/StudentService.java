package dev.dawsonvaught.studentroster.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.dawsonvaught.studentroster.models.Student;
import dev.dawsonvaught.studentroster.repositories.StudentRepository;

@Service
public class StudentService {

	private final StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public ArrayList<Student> all() {
		return studentRepository.findAll();
	}
	
	public Student create(Student student) {
		return studentRepository.save(student);
	}
	
	public Student find(Long id) {
		Optional<Student> optionalStudent = studentRepository.findById(id);
		if (optionalStudent.isPresent()) {
			return optionalStudent.get();
		} else {
			return null;
		}
	}
	
	public Student update(Student student) {
		return studentRepository.save(student);
	}
	
	public void deleteById(long id) {
		studentRepository.deleteById(id);
	}
}