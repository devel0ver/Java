package com.ahmed.olympiansinheritance;

public class BasketballPlayer extends Olympian {
	
	//vertical jump height number variable
	private int jumpHeight;
	
	public BasketballPlayer() {
		this.energylevel = 300;
	}
	
	//loaded constructor
	public BasketballPlayer(String nameInput, String countryInput, int jumpHeightInput) {
	super(nameInput, countryInput); 	//super is saying "do what the parent class did for the nameInput and countryInput"
	this.jumpHeight = jumpHeightInput;
	this.energylevel = 300;
//		super.setEnergylevel(500);
	}

	public int getJumpHeight() {
		return jumpHeight;
	}

	public void setJumpHeight(int jumpHeight) {
		this.jumpHeight = jumpHeight;
	}
	
	public void dunkBall() {
		System.out.println("Slam dunkin!");
		this.energylevel -= 10;
	}
}
