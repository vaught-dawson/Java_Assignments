package dev.dawsonvaught.savetravels.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.dawsonvaught.savetravels.models.Expense;
import dev.dawsonvaught.savetravels.services.ExpenseService;

@RestController
@RequestMapping("/api")
public class ExpensesApi {
	private final ExpenseService expenseService;

	public ExpensesApi(ExpenseService expenseService) {
		this.expenseService = expenseService;
	}

	@GetMapping("/expenses")
	public ArrayList<Expense> index() {
		return expenseService.all();
	}

	@GetMapping("/expenses/{id}")
	public Expense show(@PathVariable("id") Long id) {
		Expense expense = expenseService.find(id);
		return expense;
	}

	@PostMapping("/expenses")
	public Expense create(@RequestParam(value = "name") String name, @RequestParam(value = "description") String desc,
			@RequestParam(value = "vendor") String vendor, @RequestParam(value = "amount") Double amount) {
		Expense expense = new Expense(name, vendor, desc, amount);
		return expenseService.create(expense);
	}

	@PutMapping("/expenses/{id}")
	public Expense update(@PathVariable("id") Long id, @RequestParam(value = "name") String name,
			@RequestParam(value = "description") String desc, @RequestParam(value = "vendor") String vendor,
			@RequestParam(value = "amount") Double amount) {

		Expense expense = new Expense(name, vendor, desc, amount);
		expense.setId(id);

		return expenseService.update(expense);
	}

	@DeleteMapping("/expenses/{id}")
	public void destroy(@PathVariable("id") long id) {
		expenseService.delete(id);
	}
}
