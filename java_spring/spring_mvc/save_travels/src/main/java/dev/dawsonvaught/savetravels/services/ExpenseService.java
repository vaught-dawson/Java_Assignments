package dev.dawsonvaught.savetravels.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.dawsonvaught.savetravels.models.Expense;
import dev.dawsonvaught.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepository;

	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}

	public ArrayList<Expense> all() {
		return expenseRepository.findAll();
	}

	public Expense create(Expense expense) {
		return expenseRepository.save(expense);
	}

	public Expense find(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if (optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	
	public Expense update(Expense expense) {
		return expenseRepository.save(expense);
	}
	
	public void delete(long id) {
		expenseRepository.deleteById(id);
	}
}