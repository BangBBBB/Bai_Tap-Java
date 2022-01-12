package Lab0;

import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Vao  N Nguyen Duong:");
		int n = sc.nextInt();
		int tachSo;
		;
		int Sum = 0;
		for (; n != 0;) {
			tachSo = n % 10;
			Sum += tachSo;
			n = n / 10;
		}
		System.out.println("Sum =" + Sum);
	}

}
