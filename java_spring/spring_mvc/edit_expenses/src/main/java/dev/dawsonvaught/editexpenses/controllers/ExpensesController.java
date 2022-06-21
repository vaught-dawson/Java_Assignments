package dev.dawsonvaught.editexpenses.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import dev.dawsonvaught.editexpenses.models.Expense;
import dev.dawsonvaught.editexpenses.services.ExpenseService;

@Controller
public class ExpensesController {

	@Autowired
	ExpenseService expenseService;

	@GetMapping("/")
	public String index() {
		return "redirect:/expenses";
	}

	@GetMapping("/expenses")
	public String newExpense(@ModelAttribute("expense") Expense expense, Model model) {

		ArrayList<Expense> expenses = expenseService.all();
		model.addAttribute("expenses", expenses);

		return "/expenses/index.jsp";
	}

	@PostMapping("/expenses")
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {

		if (!result.hasErrors()) {
			expenseService.create(expense);
			return "redirect:/expenses";
		}

		return "/expenses/index.jsp";
	}

	@GetMapping("/expenses/edit/{id}")
	public String editDisplay(Model model, @PathVariable("id") long id) {
		model.addAttribute("expense", expenseService.find(id));
		return "/expenses/edit.jsp";
	}

	@PutMapping("/expenses/{id}/edit")
	public String editPut(@Valid @ModelAttribute("expense") Expense expense, BindingResult result,
			@PathVariable("id") long id) {
		if (!result.hasErrors()) {
			expense.setId(id);
			expenseService.update(expense);
			return "redirect:/expenses";
		}

		return "/expenses/edit.jsp";
	}
}