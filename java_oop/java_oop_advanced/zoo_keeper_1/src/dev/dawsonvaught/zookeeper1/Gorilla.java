package dev.dawsonvaught.zookeeper1;

public class Gorilla extends Mammal{
	
	public Gorilla() {
		super();
	}
	
	public void throwSomething() {
		System.out.println("The gorilla has thrown something, watch out!");
		this.energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("The gorilla has eaten a banana.");
		this.energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("The gorilla has climbed a tree.");
		this.energyLevel -= 10;
	}
}
