package com.ahmed.zookeeper;

public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat bat1 = new Bat();
		
		System.out.printf("Energy Level is: %s\n", bat1.displayEnergy());
		System.out.println("--------------------");
		
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		
		bat1.eatHumans();
		bat1.eatHumans();
		
		bat1.fly();
		bat1.fly();
		
		System.out.printf("\nEnergy Level is now: %s", bat1.displayEnergy());
		
	 
	}

}
