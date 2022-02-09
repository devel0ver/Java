package com.ahmed.zookeeper;

public class MammalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal mamal1 = new Mammal();
		
		System.out.println(mamal1.displayEnergy());
		
		Gorilla gorilla1 = new Gorilla();
		
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		
		gorilla1.climb();
		
		
		
		System.out.println(gorilla1.displayEnergy());

	}

}
