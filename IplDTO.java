package com.xworkz.dto;

public class IplDTO {
	private int noOFTeams;
	private int teamSize;
	private String owner;
	private String sponsor;

	public IplDTO() {
		System.out.println("invoked no argument constructor");

	}

	public IplDTO(int noOFTeams, int teamSize, String owner, String sponsor) {
		super();
		this.noOFTeams = noOFTeams;
		this.teamSize = teamSize;
		this.owner = owner;
		this.sponsor = sponsor;
	}

	public int getNoOFTeams() {
		return noOFTeams;
	}

	public void setNoOFTeams(int noOFTeams) {
		this.noOFTeams = noOFTeams;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

}
