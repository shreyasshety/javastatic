package com.xworkz.dto.dp;

import com.xworkz.dto.WalletDTO;
import com.xworkz.dto.dp.dao.WalletDAO;

public class RunWallet {

	public static void main(String[] args) {
		WalletDTO ref = new WalletDTO();
		ref.setCompanyName("hornbull");
		ref.setCoinCompartment(true);
		ref.setPrice(1000);
		ref.setMaterial("leather");
		ref.getCompanyName();
		ref.setTotalCompartments(4);
		WalletDTO ref1 = new WalletDTO("tommy", "pu", 999, 4, false);
		WalletDTO ref2 = new WalletDTO("puma", "plastic", 99, 5, false);

		WalletDAO ref3 = new WalletDAO();
		ref3.create(ref1);
		ref3.create(ref2);

		ref3.create(ref2, 0);
		ref3.create(ref1, 44);

		int pineapple = ref3.IndexOccupied();
		System.out.println(pineapple);

		boolean found = ref3.matchWalletByWalletname("hornbull");
		System.out.println(found);

	}

}
