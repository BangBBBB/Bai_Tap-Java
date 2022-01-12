package Bai3NC;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SoPhuc sp1 = new SoPhuc();
		SoPhuc sp2 = new SoPhuc();
		
		sp1.nhap();
		sp2.nhap();
		System.out.println("Phep Cong Hai So Phuc:");
		System.out.println(sp1.congSoPhuc(sp2));
		System.out.println("Tich Hai So Phuc La:");
		System.out.println(sp1.nhanSoPhuc(sp2));
		System.out.println("Thuong Hai So Phuc La:");
		System.out.println(sp1.chiaSoPhuc(sp2));
	}
}
