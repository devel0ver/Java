package com.ahmed.caresoftinterfaces;

public abstract class User {
	protected Integer id;
	protected int pin;
	
	
	
	// Implement a constructor that takes an ID
    public User(Integer Id) {
    	this.id = Id;
    }
	
    // TO DO: Getters and setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}

	
	
	
}
