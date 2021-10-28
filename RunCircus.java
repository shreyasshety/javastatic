package com.xworkz.dto.dp;

import com.xworkz.dto.CircusDTO;
import com.xworkz.dto.dp.dao.CircusDAO;

public class RunCircus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircusDTO ref=new CircusDTO();
		ref.setDuration(1);
		ref.setNoOfAnimals(12);
		ref.setNoOfShows(3);
		ref.setOwnername("sam");
		ref.setTicketprice(200);
		CircusDTO ref1=new CircusDTO("ram",100,10,3,2);
		CircusDTO ref2=new CircusDTO("shyam",113,15,3,3);

		
		CircusDAO ref3 = new CircusDAO();
		ref3.create(ref1);
		
		ref3.create(ref1, 0);
		ref3.create(ref2, 1);
		
		int pineapple= ref3.IndexOccupied();
		System.out.println(pineapple);
		

		boolean found = ref3.matchownerByOwnername("sam");
		System.out.println(found);
	}

}
