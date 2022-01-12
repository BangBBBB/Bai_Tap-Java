package Lab0;

import java.util.Scanner;

public class Bai9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" Nhap n = ");
		int n = sc.nextInt();
		
		System.out.println("So fibonaci Thu "+n+" la : "+fibonaci(n));

	}

	public static int fibonaci(int n) {
		int f0 = 1;
		int f1 = 1;
		int fn = 1;

		if (n < 0) {
			return -1;
		} else if (n == 0 || n == 1) {
			return n;
		} else {
			for (int i = 2; i < n; i++) {
				f0 = f1;
				f1 = fn;
				fn = f0 + f1;
			}
		}
		return fn;
	}
}
