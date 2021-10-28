package com.xworkz.dto.dp.dao;

import com.xworkz.dto.WalletDTO;

public class WalletDAO {
	private WalletDTO[] walletdto = new WalletDTO[100];
	private int count = 0;

	public void create(WalletDTO dto) {
		if (count < walletdto.length) {
			this.walletdto[count++] = dto;
			System.out.println("invoked create method: ");
			System.out.println("added companyname: ".concat(dto.getCompanyName()));
		} else {

			System.err.println("error");
		}

	}

	public void create(WalletDTO dto, int index) {
		if (count < walletdto.length) {
			this.walletdto[index] = dto;
			System.out.println("wallet company added is : ".concat(dto.getCompanyName()).concat(" | In the index : ")
					.concat(String.valueOf(index)));

		}

	}

	public int IndexOccupied() {
		return count++;
	}

	public boolean matchWalletByWalletname(String walletName) {
		System.out.println("invoked matchWalletByWalletname");
		System.out.println("added company name".concat(walletName));
		for (int i = 0; i < walletdto.length; i++) {
			WalletDTO ref = this.walletdto[i];
			if (ref != null) {
				System.out.println("ref in index is not  null : ".concat(String.valueOf(i)));
				String tempname = ref.getCompanyName();
				// System.out.println("matching :".concat(tempname));

				if (walletName.equals(tempname)) {
					System.out.println("team name  found");

					return true;
				}

			}
		}
		return false;

	}
}
