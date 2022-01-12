package Lab0;

import java.util.Scanner;

public class Bai7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Nhap n = ");
		int n = sc.nextInt();

		int giaiThua = n;
		for (int i = 1; i < n; i++) {
			giaiThua *= i;
		}
		System.out.println(n + "! = " + giaiThua);
	}
}
