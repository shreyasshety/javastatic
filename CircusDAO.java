package com.xworkz.dto.dp.dao;

import com.xworkz.dto.CircusDTO;
import com.xworkz.dto.WalletDTO;

public class CircusDAO {
	private CircusDTO[] circusdto =new CircusDTO[100];
	private int count=0;
	
	public void create(CircusDTO dto)
	{
		if(count<circusdto.length) {
		this.circusdto[count++]= dto;
		System.out.println("invoked create");
		System.out.println("ownername added: " .concat(dto.getOwnername()));
		}
		else {
			System.err.println("errror");
		}
	
	}
	public void create(CircusDTO dto, int index)
	{
		if(count<circusdto.length)
		{
			this.circusdto[index]=dto;
			System.out.println("owner name added is : ".concat(dto.getOwnername()).concat(" | In the index : ").concat(String.valueOf(index)));

		}
	}
	public int IndexOccupied()
	{
		return count++ ;
	}
	public boolean matchownerByOwnername(String OwnerName)
	{
		System.out.println("invoked matchWalletByWalletname" );
		System.out.println("added company name".concat(OwnerName) );
		for (int i = 0; i < circusdto.length; i++) {
			CircusDTO ref = this.circusdto[i];
			if(ref!=null)
			{
				System.out.println("ref in index is not  null : " .concat(String.valueOf(i)));
				String tempname=ref.getOwnername();
				//System.out.println("matching :".concat(tempname));

				if(OwnerName.equals(tempname))
				{
					System.out.println("Owner name  found");
					
					return true;
			}
			
		}
		}
		return false;
}
}