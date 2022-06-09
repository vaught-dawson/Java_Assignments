package dev.dawsonvaught.coffeedore64;

public class TestCoffeeKiosk {
    public static void main(String[] args) {
    	
    	CoffeeKiosk kiosk = new CoffeeKiosk();
    	
        // Menu items
    	kiosk.addMenuItem("Banana", 2)
    		.addMenuItem("Coffee", 1.5)
	    	.addMenuItem("Latte", 4.5)
	    	.addMenuItem("Cappuccino", 3)
	    	.addMenuItem("Muffin", 4);
    
    	kiosk.displayMenu();
    	
//    	kiosk.newOrder();
    	
    	kiosk.addMenuItemsByInput();
    }
}
