package Lab0;

import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Nhap n = ");
		int n = sc.nextInt();

		float sum = 0;
		for (int i = 1; i <= n; i++) {

			sum += (float) i / giaiThua(i);
		}

		System.out.println("Tong 1/1! + 2/2! + .." + n + "/" + n + "!  = " + sum);

	}

	public static int giaiThua(int n) {
		if (n == 0) {
			return 1;
		}
		return (n * giaiThua(n - 1));
	}

}
