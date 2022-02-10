package com.ahmed.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		this.energyLevel = 300;
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("Churp! Churp! Churp!");
	}
	
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("So well, never mind");
	}
	
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("Booooom! AHHHHHHH! FIRE!!!");
	}
}
