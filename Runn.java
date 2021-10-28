package com.xworkz.dto.dp;

import com.xworkz.dto.IplDTO;
import com.xworkz.dto.dp.dao.IplDAO;

public class Runn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IplDTO ref = new IplDTO();
		ref.setNoOFTeams(5);
		ref.setOwner("malya");
		ref.setSponsor("puma");
		ref.setTeamSize(24);
		IplDTO ref1 = new IplDTO(3, 24, "shrey", "adidas");
		IplDTO ref2 = new IplDTO(4, 24, "sonu", "nike");
		IplDTO ref4 = new IplDTO(4, 24, "sonu", "lacoste");

		IplDAO ref3 = new IplDAO();

		ref3.create(ref1);
		ref3.create(ref2);
		ref3.create(ref4);

		ref3.create(ref2, 44);
		int pineapple = ref3.indexOccupied();
		{
			System.out.println(pineapple);
		}
		boolean found = ref3.matchIplBySponsor("lacoste");
		System.out.println(found);
		
		
		//ref3.display();
	}

}
