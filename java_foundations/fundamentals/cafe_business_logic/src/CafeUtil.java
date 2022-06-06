import java.util.ArrayList;

public class CafeUtil {
	public int getStreakGoal() {
		int sum = 1;
		for (int i = 2; i <= 10; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public int getStreakGoal(int numWeeks) {
		int sum = 1;
		for (int i = 2; i <= numWeeks; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public double getOrderTotal(double[] prices) {
		double total = 0;
		for (double price : prices) {
			total += price;
		}
		
		return total;
	}
	
	public void displayMenu(ArrayList<String> menuItems) {
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.printf("%o %s\n", i, menuItems.get(i));
		}
		System.out.println("");
	}
	
	public void addCustomer(ArrayList<String> customers) {
		System.out.print("Please enter your name: ");
		String newCustomer = System.console().readLine();
		System.out.println("");
		System.out.printf("Hello, %s!\nThere are %o people in front of you\n\nLine:\n----------------------------\n", newCustomer, customers.size());
		
		customers.add(newCustomer);
		
		for (String customer : customers) {
			System.out.println(customer);
		}
	}
	
	public void printPriceChart(String product, double price, int maxQuantity) {
		System.out.println(product);
		
		for (int i = 1; i <= maxQuantity; i++) {
			System.out.printf("%o - $%.2f\n", i, price * i - .5 * (i - 1));
		}
		
		System.out.println("");
	}
	
	public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
		if (menuItems.size() != prices.size())
			return false;
		
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.printf("%o %s -- $%.2f\n", i, menuItems.get(i), prices.get(i));
		}
		System.out.println("");
		return true;
	}
	
	public void addCustomers(ArrayList<String> customers) {
		while (true) {
			System.out.print("Please enter the customer's name: ");
			String newCustomer = System.console().readLine();			
			if (newCustomer.equals("q")) break;
			System.out.println("Success.");
			
			customers.add(newCustomer);
		}
		
		System.out.println("Line:\n----------------------------");
		for (String customer : customers) {
			System.out.println(customer);
		}
	}
}
