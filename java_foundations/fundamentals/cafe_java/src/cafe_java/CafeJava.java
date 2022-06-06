package cafe_java;

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.1;
        double lattePrice = 3.7;
        double cappucinoPrice = 4.1;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.printf("%s ordered a %s | isReady: %B\n\n", customer1, "coffee", isReadyOrder1);
        
        if (isReadyOrder4) {
        	System.out.printf("%s's order of a %s is ready!\nTotal: $%.2f\n\n", customer4, "cappucino", cappucinoPrice);
        } else {
        	System.out.printf("%s's order is not ready yet", customer4);
        }
        
        if (isReadyOrder2) {
        	System.out.printf("%s's order of a %s is ready!\nTotal: $%.2f\n\n", customer2, "lattes", lattePrice * 2);
        } else {
        	System.out.printf("%s's order is not ready yet", customer2);
        }
        
    	System.out.printf("%s was charged $%.2f for a %s but wanted a %s. They now owe $%.2f\n\n", customer2, dripCoffeePrice, "coffee", "latte", (lattePrice - dripCoffeePrice));
    }
}
