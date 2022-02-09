package com.ahmed.olympiansinheritance;

public class OlympianTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello World!");
		
		Olympian olympian1 = new Olympian();
//		Olympian olympian2 = new Olympian("Phelps", "USA");
		
//		System.out.println(olympian1.getName());
//		System.out.println(olympian2.getName());
//		
//		olympian1.displayCountry();
//		olympian2.displayCountry();

//		olympian1.displayEnergy();
		
		//SWIMMERS BELOW -> these swimmers have inherited from Olympian
		Swimmer swimmer1 = new Swimmer();
		Swimmer swimmer2 = new Swimmer("Phelps", "USA", 200);
		System.out.println(swimmer1.getName()); 
		System.out.println(swimmer1.getCountry());
		System.out.println(swimmer1.getEnergylevel());
		System.out.println(swimmer1.getSwimSpeed());
		
		System.out.println("Swimmer 2 info below!");
		System.out.println(swimmer2.getName()); 
		System.out.println(swimmer2.getCountry());
		System.out.println(swimmer2.getEnergylevel());
		System.out.println(swimmer2.getSwimSpeed());
		
		swimmer2.swim();
		System.out.println(swimmer2.getEnergylevel());
		
		//basketball players below!!
		BasketballPlayer baller1 = new BasketballPlayer("Lebron", "USA", 48);
		
		System.out.println("Basketball player info below!");
		System.out.println(baller1.getName()); 
		System.out.println(baller1.getCountry());
		System.out.println(baller1.getEnergylevel());
		System.out.println(baller1.getJumpHeight());
		
		baller1.dunkBall();
		System.out.println(baller1.getEnergylevel());
	}

}
