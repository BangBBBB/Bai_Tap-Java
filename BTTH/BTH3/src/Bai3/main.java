package Bai3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap So Ho Dan ");
		int n = scan.nextInt();
		for(int i =0 ; i< n ; i++) {
			BienLai bl = new BienLai();
			bl.nhap();
			bl.hienThi();
		}
		
		
	}
}
