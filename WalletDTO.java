package com.xworkz.dto;

public class WalletDTO {
	private String companyName;
	private String material;
	private int totalCompartments;
	private int price;
	private boolean coinCompartment;

	public WalletDTO() {
		System.out.println("invoked default constructor");
	}

	public WalletDTO(String companyName, String material, int totalCompartments, int price, boolean coinCompartment) {
		super();
		this.companyName = companyName;
		this.material = material;
		this.totalCompartments = totalCompartments;
		this.price = price;
		this.coinCompartment = coinCompartment;
	}

	public String getCompanyName() {
		System.out.println(companyName);
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getTotalCompartments() {
		return totalCompartments;
	}

	public void setTotalCompartments(int totalCompartments) {
		this.totalCompartments = totalCompartments;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isCoinCompartment() {
		return coinCompartment;
	}

	public void setCoinCompartment(boolean coinCompartment) {
		this.coinCompartment = coinCompartment;
	}
}
