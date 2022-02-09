package com.ahmed.zookeeper;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		this.energyLevel -= 5;
		System.out.println("The gorilla threw bananas!");
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("The gorilla is eating bananas. YUM YUM!");
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("The gorilla is climbed a tree");
	}
}
