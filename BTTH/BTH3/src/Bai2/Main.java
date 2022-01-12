package Bai2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		TheMuon themuon = new TheMuon();
		Scanner sc =  new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Nhap Thong Tin The Muon");
			System.out.println("2.Hien Thi Thong Tin The Muon");
			System.out.println("3.Thoat");
			
			int chon = sc.nextInt();
			switch(chon) {
				case 1:
						System.out.println("Ban Da Chon Nhap Thong Tin!!");
						themuon.nhapTT();
						break;
				case 2: 
					themuon.hienThi();
					break;
				case 3: 
					return;
				default: System.out.println("Vui long nhap dung!!!");
				continue;
			}
		}
	}
}
