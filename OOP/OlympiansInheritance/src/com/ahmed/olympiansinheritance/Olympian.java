package com.ahmed.olympiansinheritance;

public class Olympian {
	//name
	protected String name;	//pretected means that only this file and the classes that have inherited from this file can see/access these variables
	//energylevel
	protected int energylevel = 100;
	//country
	protected String country;
	
	//constructor
	public Olympian() {
		this.name = "Guest user";
		this.country = "World";
	}
	
	//loaded constructor
	public Olympian(String nameInput, String countryInput) {
		this.name = nameInput;
		this.country = countryInput;
	}
	
	//display energy
	public void displayEnergy() {
		System.out.println("Energy level: " + this.energylevel);
	}
	
	//display country
	public void displayCountry() {
		System.out.println("Country: " + this.country);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergylevel() {
		return energylevel;
	}

	public void setEnergylevel(int energylevel) {
		this.energylevel = energylevel;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
