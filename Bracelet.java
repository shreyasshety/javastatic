package com.xworkz.dto.dp;

public class Bracelet {
	private String color;
	private String material;
	private int price;
	private boolean gemused;
	private boolean gift;
	public Bracelet() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	public Bracelet(String color, String material, int price, boolean gemused, boolean gift) {
		super();
		this.color = color;
		this.material = material;
		this.price = price;
		this.gemused = gemused;
		this.gift = gift;
	}





	public String getColor() {
		return color;
	}





	public void setColor(String color) {
		this.color = color;
	}





	public String getMaterial() {
		return material;
	}





	public void setMaterial(String material) {
		this.material = material;
	}





	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	public boolean isGemused() {
		return gemused;
	}





	public void setGemused(boolean gemused) {
		this.gemused = gemused;
	}





	public boolean isGift() {
		return gift;
	}





	public void setGift(boolean gift) {
		this.gift = gift;
	}
	



}
