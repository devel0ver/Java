package com.ahmed.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Gorilla gorilla1 = new Gorilla();
		
		System.out.println(gorilla1.displayEnergy());
		
		
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		
		gorilla1.climb();
		
		System.out.println(gorilla1.displayEnergy());

	}

}
