import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
    	Date date = new Date();
        return String.format("It is currently %s", date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if (conversation.toLowerCase().indexOf("alexis") >= 0) {
        	return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.toLowerCase().indexOf("alfred") >= 0) {
        	return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    public String guestGreeting(String name, String dayPeriod) {
    	return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
    public String guestGreeting() {
    	int hourOfTheDay = new Date().getHours();
    	String dayTime;
    	
    	if (hourOfTheDay >= 0 && hourOfTheDay < 12) {
    		dayTime = "morning";
    	} else if ((hourOfTheDay >= 12 && hourOfTheDay < 18)) {
    		dayTime = "afternon";    		
    	} else {
    		dayTime = "evening";    		    		
    	}
    	
    	return String.format("Good %s, %s. Lovely to see you.", dayTime, "Dawson");
    }
    
    public String yell() {
    	return "AAAAAAAAAAAAAAAAAAAAAAAAAAA";
    }
    
    public String yell(String words) {
    	return words.toUpperCase() + "!";
    }
}

