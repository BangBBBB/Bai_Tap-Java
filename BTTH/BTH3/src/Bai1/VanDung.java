package Bai1;

import java.util.Scanner;

public class VanDung extends Nguoi{
	public static void main(String[] args) {
		Nguoi nguoi = new Nguoi();
		while(true) {
			System.out.println("1.Nhap Thong Tin Nguoi");
			System.out.println("2.In Thong Tin Nguoi");
			System.out.println("3. Thoat.");
			
			Scanner scan = new Scanner(System.in);
			
			int chon = scan.nextInt();
			switch(chon) {
			case 1: System.out.println("Ban Da chon Nhap Thong Tin");
					nguoi.nhapTT();
					break;
			case 2: System.out.println("Ban Da Chon In Thng Tin");
					nguoi.inTT();
					break;
			case 3: 
				return;
			default:
				System.out.println("Vui Long Chon Dung");
				continue;
			}
			
		}
	}
}
