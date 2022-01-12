package Lab0;

import java.util.Scanner;

// Viết chương trình kiểm tra xem một số nguyên nhập vào có phải là số nguyên tố.
public class Bai11 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Nhap Vao  N Nguyen Duong:");
		int n = sc.nextInt();
		if(KtraSNT(n) == 1) {
			System.out.println("La SNT");
		}
		else {
			System.out.println("Khong phai SNT");
		}
		
	}
	public static int KtraSNT(int n) {
		if(n<2) {
		return 0;
		}
		else {
			int can = (int) Math.sqrt(n);
			for(int i =2 ; i <= can; i++ ) {
				if(n%i ==0) {
					return 0;
				}
			}
		}
		return 1;
	}
	
}
