package dev.dawsonvaught.abstractart;

public class TestMuseum {

	public static void main(String[] args) {
		Museum test = new Museum();
		
		test.addToWorks(new Painting("One", "One", "This is one", "Watercolor"));
		test.addToWorks(new Painting("Two", "Two", "This is two", "Oils"));
		test.addToWorks(new Painting("Three", "Three", "This is three", "Charcoal"));
		test.addToWorks(new Sculpture("Four", "Four", "This is four", "Marble"));
		test.addToWorks(new Sculpture("Five", "Five", "This is five", "Bronze"));
		
//		test.displayWorks();
		test.displayRandomWorks();
	}

}
