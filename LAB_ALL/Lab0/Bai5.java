package Lab0;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println(" Nhap n = ");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {

			sum+= i;
		}
		System.out.println("Tong Cac So Tu 1 Den "+n+" la : "+sum);
	}

}
