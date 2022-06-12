package dev.dawsonvaught.abstractart;

import java.util.ArrayList;
import java.util.Random;

public class Museum {
	private ArrayList<Art> works;

	public Museum() {
		this.setWorks(new ArrayList<Art>());
	}

	public ArrayList<Art> getWorks() {
		return works;
	}

	public void setWorks(ArrayList<Art> works) {
		this.works = works;
	}
	
	public void addToWorks(Art newWorkOfArt) {
		this.works.add(newWorkOfArt);
	}
	
	public void displayWorks() {
		for (Art work : this.works) {
			work.viewArt();
		}
	}
	
	public void displayRandomWorks() {
		ArrayList<Art> temp = new ArrayList<Art>(this.works);
		Random rand = new Random();
		
		while (temp.size() > 0) {
			temp.remove(rand.nextInt(temp.size())).viewArt();
		}
	}
}
