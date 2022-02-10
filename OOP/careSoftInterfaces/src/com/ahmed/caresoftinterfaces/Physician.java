package com.ahmed.caresoftinterfaces;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {

	// Inside class: 
	private ArrayList<String> patientNotes;
	
	
	// TO DO: Constructor that takes an ID
	public Physician(Integer Id) {
		super(Id);
	}
	
	
	// TO DO: Implement HIPAACompliantUser!
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		if(pin>999 && pin<10000) {
			this.pin = pin;
			return true;
		}
		return false;
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if (this.id == confirmedAuthID) {
			return true;
		}
		return false;
	}
	
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }


	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}


	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
    
	
}
