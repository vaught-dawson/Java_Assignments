package dev.dawsonvaught.zookeeper2;

public class Mammal {
	
	protected int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergyLevel() {
		System.out.printf("Energy Level: %d\n", this.energyLevel);
		return this.energyLevel;
	}
}
