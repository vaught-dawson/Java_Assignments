package dev.dawsonvaught.coffeedore64;

import java.util.ArrayList;

public class CoffeeKiosk {
	private ArrayList<Item> menu;
	private ArrayList<Order> orders;

	public CoffeeKiosk() {
		this.menu = new ArrayList<Item>();
		this.orders = new ArrayList<Order>();
	}

	public ArrayList<Item> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Item> menu) {
		this.menu = menu;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	public CoffeeKiosk addMenuItem(String name, double price) {
		Item item = new Item(name, price);
		item.setIndex(this.menu.size());
		this.menu.add(item);
		return this;
	}

	public void displayMenu() {
		System.out.println("");
		for (Item item : this.menu) {
			System.out.printf("%o %s -- $%.2f\n", item.getIndex(), item.getName(), item.getPrice());
		}
		System.out.println("");
	}

	public CoffeeKiosk newOrder() {
		System.out.print("Please enter customer name for new order: ");
		String name = System.console().readLine();
		System.out.println("");
		
		Order order = new Order(name);
		String itemNumber = "";
		do {
			if (itemNumber != "") 
				order.addItem(this.menu.get(Integer.parseInt(itemNumber)));
			
			System.out.print("Please enter a menu item index or q to quit: ");
			itemNumber = System.console().readLine();
			System.out.println();
		}
		while (!itemNumber.equals("q"));
		
		order.display();
		this.orders.add(order);
		return this;
	}

	public CoffeeKiosk addMenuItemsByInput() {
		
		while (true){
			String itemName = "";
			while (itemName.equals("")) {
				
				System.out.printf("Item name: ");
				itemName = System.console().readLine();
				System.out.println("");
			}
			
			if (itemName.equals("q")) break;
			
			double itemPrice = -1;
			while (itemPrice < 0 || Double.isNaN(itemPrice)) {
				System.out.printf("Item price: $");
				itemPrice = Double.parseDouble(System.console().readLine());
				System.out.println("");
				
				if (itemPrice < 0) {
					System.out.println("Price can not be below $0");
				} else if (Double.isNaN(itemPrice)) {
					System.out.println("Invalid number");
				} 
			}
			
			this.addMenuItem(itemName, itemPrice);
		}
		
		this.displayMenu();
		return this;
	}
}
