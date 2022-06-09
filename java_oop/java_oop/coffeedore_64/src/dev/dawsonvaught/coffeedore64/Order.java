package dev.dawsonvaught.coffeedore64;

import java.util.*;

public class Order {
	private String name;
	private double total;
	private boolean ready;
	private ArrayList<Item> items;
	
	public Order() {
		this.name = "Guest";
		this.items = new ArrayList<Item>();
	}
	
	public Order(String name) {
		this.name = name;
		this.items = new ArrayList<Item>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getTotal() {
		return this.total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public boolean isReady() {
		return this.ready;
	}
	
	public void setReady(boolean ready) {
		this.ready = ready;
	}
	
	public ArrayList<Item> getItems() {
		return this.items;
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public String getStatusMessage() {
		if (this.ready) {
			return "Your order is ready.";
		} else {
			return "Thank you for waiting. Your order will be ready soon.";
		}
	}
	
	public double getOrderTotal() {
		double sum = 0;
		
		for (Item item : this.items) {
			sum += item.getPrice();
		}
		
		return sum;
	}
	
	public void display() {
		System.out.printf("Customer Name: %s\n", this.name);
		
		for (Item item : this.items) {
			System.out.printf("%s - $%.2f\n", item.getName(), item.getPrice());
		}
		
		System.out.printf("Total: $%.2f\n\n", this.getOrderTotal());
	}
}
