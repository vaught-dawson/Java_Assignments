import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
	public ArrayList<Integer> getTenRolls() {
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			int randNum = rand.nextInt(20) + 1;
			rolls.add(randNum);
		}
		
		return rolls;
	}
	
	public char getRandomLetter() {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		Random rand = new Random();
		int randIndex = rand.nextInt(letters.length());
		return (char) letters.charAt(randIndex);
	}
	
	public String generatePassword() {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*()-_=+[]{}|;':\",.<>/\\`~?";
		String characters = letters + numbers + symbols;
		Random rand = new Random();
		
		String output = "";
		for (int i = 0; i < 8; i++) {
			int randIndex = rand.nextInt(characters.length());
			output += characters.charAt(randIndex);
		}
		
		return output;
	}
	
	public ArrayList<String> getNewPasswordSet(int length) {
		ArrayList<String> outputPasswords = new ArrayList<String>();
		
		for (int i = 0; i < length; i++) {
			outputPasswords.add(this.generatePassword());
		}
		
		return outputPasswords;
	}
	
	public void shuffleArray(String[] items) {
		Random rand = new Random();
		
		for (int i = 0; i < items.length; i++) {
			int randIndex = rand.nextInt(items.length);
			String temp = items[i];
			items[i] = items[randIndex];
			items[randIndex] = temp;
		}
	}
}
