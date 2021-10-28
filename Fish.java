package com.xworkz.inheritence;

public class Fish {
	public String region = "ocean";
	boolean alive = false;
	
	public Fish() {
		System.out.println("invoked Fish const");
		System.out.println(region);
		System.out.println(alive);
	}

}
