package com.ahmed.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		this.energyLevel = 100;
	}
	
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("The gorilla is throwing bananas!!");
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("The gorilla is eating bananas. YUM YUM!");
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("The gorilla climbed a tree");
	}
}
