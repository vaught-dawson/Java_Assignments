package dev.dawsonvaught.zookeeper2;

public class Bat extends Mammal{
	public Bat() {
		super();
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Whooosh!!");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("AAAAAAAAHHHHHHHHHHHHHHHHHH!!!!!");
		this.energyLevel -= 100;
	}
}
