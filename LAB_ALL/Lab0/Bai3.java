package Lab0;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Giai Phuong trinh ax+b =0");
		
		System.out.println("Nhap He So a = ");
		 int a = sc.nextInt();
		 
		 System.out.println("Nhap He so b = ");
		 int  b= sc.nextInt();
		 
		 if(a == 0) {
			 if( b== 0) {
				 System.out.println("Phuong Trinh Vo So Nghiem");
			 }
			 else {
				 System.out.println("Phuong Trinh Vo Nghiem");
			 }
			 
		 }
		 else {
			 System.out.println("Phuong Trinh Co Nghiem  x= "+(float)-b/a);
		 }
	
	}
}
