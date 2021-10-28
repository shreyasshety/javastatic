package com.xworkz.dto;

public class CircusDTO {
	private String ownername;
	private int ticketprice;
	private int noOfAnimals;
	private int noOfShows;
	private int duration;
	
	public CircusDTO()
	{
		System.out.println("invoked default constructor");
	}

	public CircusDTO(String ownername, int ticketprice, int noOfAnimals, int noOfShows, int duration) {
		super();
		this.ownername = ownername;
		this.ticketprice = ticketprice;
		this.noOfAnimals = noOfAnimals;
		this.noOfShows = noOfShows;
		this.duration = duration;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public int getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(int ticketprice) {
		this.ticketprice = ticketprice;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
