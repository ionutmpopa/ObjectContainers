package com.iopo;

import java.util.*;

public class Hobby {
	
	private final String hobbyName;
	private final int frequency;
	private final List<Adresa> myAddress;
	
	
	public Hobby(String hobbyName, int frequency) {
		this.hobbyName = hobbyName;
		this.frequency = frequency;
		this.myAddress = new ArrayList<>();
		
		
	}
	
	public boolean addAddress (String cityName, String countryName) {

	    Adresa address = new Adresa(cityName, countryName);

	    myAddress.add(address);
	    return true;

	}


	public String getHobbyName() {
		return hobbyName;
	}


	public int getFrequency() {
		return frequency;
	}


	public List<Adresa> getMyAddress() {
		return myAddress;
	}
	
	public String toString() {
		
		return "HobbyName: " + this.hobbyName + " -> " + "Address: " + this.myAddress;
	}
	
	
	
	


	
}
