package Lab0;

import java.util.Scanner;

public class Bai1_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap So Thu Nhat: ");
		int a = sc.nextInt();

		System.out.println("Nhap So Thu Hai:");
		int b = sc.nextInt();

		System.out.println("Tong Hai So La : " + (a + b));

		System.out.println("Hieu Hai So La : " + (a - b));

		System.out.println("Tich Hai So La : " + (a * b));

		if (b == 0) {
			System.out.println("Vui long Nhap So Thu Hai Khac 0 !");
		} else {

			System.out.println("Thuong Hai So La : " + ((float) a / b));
		}
	}
}
