package Lab0;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Nhap n = ");
		int n = sc.nextInt();

		float sum = 0;
		for (int i = 1; i <= n; i++) {

			sum += 1.0 / i;
		}
		System.out.println("Tong Cac So 1+ 1/2 + 1/3 + ... 1/" + n + " = " + sum);
	}
}
