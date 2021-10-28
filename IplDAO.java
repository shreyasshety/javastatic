package com.xworkz.dto.dp.dao;

import com.xworkz.dto.IplDTO;

public class IplDAO {
	private int count = 0;
	private IplDTO[] ipldtos = new IplDTO[100];

	public void create(IplDTO dto) {
		if (count < this.ipldtos.length) {
			this.ipldtos[count++] = dto;
			System.out.println("invoked create method ");
System.out.println("added sponsor: ".concat(dto.getSponsor()));
		} else {

			System.err.println("error");
		}

	}

	public void create(IplDTO dto, int index) {
		if (count < this.ipldtos.length) {
			this.ipldtos[index] = dto;
			System.out.println("sponsor added is : ".concat(dto.getSponsor()).concat(" | In the index : ").concat(String.valueOf(index)));
		}

	}

	public int indexOccupied() {
		return count+1;
	}
	public boolean matchIplBySponsor(String sponsorname)
	{
		System.out.println("invoked matchIplBySponsor");
		System.out.println("Sponsor name passed : " .concat(sponsorname));
		for (int i = 0; i < this.ipldtos.length; i++) {
			IplDTO ref = this.ipldtos[i];
			if(ref!=null)
			{
				System.out.println("ref in index is not  null : " .concat(String.valueOf(i)));
				String tempname=ref.getSponsor();
				//System.out.println("matching :".concat(tempname));

				if(sponsorname.equals(tempname))
				{
					System.out.println("team name  found");
					
					return true;
				}
			}
		}

				return false;

	}
	
	
}
	

