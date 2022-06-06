import java.util.ArrayList;

public class TestPuzzleJava {

	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		System.out.println(generator.getRandomLetter());
		System.out.println(generator.generatePassword());
		System.out.println(generator.getNewPasswordSet(4));
		String[] testArr = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		printArray(testArr);
		generator.shuffleArray(testArr);
		printArray(testArr);
	}
	
	public static void printArray(Object[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%s, ", arr[i]);
		}
		System.out.println("");
	}
}
