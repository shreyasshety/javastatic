package com.xworkz.inheritence;

public class NaturalSaloon extends Saloon {
	
	public String name = "sonu";
	public int noOfHajamas = 5;
	
	public NaturalSaloon() {
		this("ss");
	System.out.println("invoked NaturalSaloon constructor");
	System.out.println("name is :" .concat(name));
//	System.out.println("no of hajamas is :" .concat(.valueOf(noOfHajamas)));
	

	}

	public NaturalSaloon(String name) {
		
	//	this.name = name;
		System.out.println("invoked parameterized natural saloon constructor");
		
		}

}
