package com.xworkz.dto;

import com.xworkz.dto.dp.Bracelet;

public class Runner {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bracelet ref0=new Bracelet();
	
		ref0.setColor("red");
		ref0.setMaterial("gold");
		ref0.setPrice(50000);
		ref0.setGemused(false);	
		ref0.setGift(false);
		
		
		Bracelet ref1=new Bracelet("silver","iron",1000,true,true);
		Bracelet ref2=new Bracelet("pink","silver",50000,true,true);
		Bracelet ref3=new Bracelet("yellow","platinum",7000,true,true);
		Bracelet ref4=new Bracelet("red","platinum",7000,true,true);
		//Bracelet ref5=new Bracelet("gold","iron",10,true,true);
		
		Bracelet[] brac = new Bracelet[5];
		brac[0]=ref0;
		brac[1]=ref1;
		brac[2]=ref2;
		brac[3]=ref3;
		brac[4]=ref4;
		
		
		for (int i = 0; i < brac.length; i++) {
			Bracelet br=brac[i];
			if(br!=null) {
			System.out.println(br.getColor());
			System.out.println("-----------------------------------");
			System.out.println(br.getMaterial());
			System.out.println("-----------------------------------");
			System.out.println(br.getPrice());
			System.out.println("-----------------------------------");
			System.out.println(br.isGemused());
			System.out.println("-----------------------------------");
			System.out.println(br.isGift());
			System.out.println("-----------------------------------");
			}
			else {
				System.out.println("index is pointing to null".concat(String.valueOf(i)));
			}
			
		}
	}

}
