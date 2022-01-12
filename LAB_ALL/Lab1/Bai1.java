package Lab1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		String hoTen = "Do Xuan Bang";
		
		System.out.print("Ho Ten: "+hoTen);
		
		String lop = "AT16B";

		System.out.print("\tLop: "+lop);
		
		String email = "Bang12e.yka@gmai.com";
		System.out.print("\tDia Chi Email: "+email);
		System.out.println("");
		for(int i = 9 ; i >0 ; i--) {
			System.out.println("");
			System.out.println("Take one down, pass it around, ");
			System.out.println(i+" bottles of beer on the wall,"+i+"bottles of beer");
			
		}
	
		System.out.println("No more bottles of beer on the wall.");
				
		
	}
}
