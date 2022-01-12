package Lab0;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Giai Phuong trinh ax^2 + bx + c =0");

		System.out.println("Nhap He So a = ");
		int a = sc.nextInt();

		System.out.println("Nhap He So b = ");
		int b = sc.nextInt();

		System.out.println("Nhap He So c = ");
		int c = sc.nextInt();

		if (a == 0) {
			if (b == 0) {

				if (c == 0) {
					System.out.println("Phuong Trinh Vo So Nghiem");
				} else {
					System.out.println("Phuong Trinh Vo Nghiem");
				}
			} else {
				System.out.println("Phuong Trinh Co Nghiem x = " + (float) -c / b);
			}

		} else {
			float delta = (b * b) - (4 * a * c);

			if (delta < 0) {

				System.out.println("Phuong Trinh Vo Nghiem");
			} else if (delta == 0) {
				System.out.println("Phuong Trinh Co Nghiem Kep x1 = x2 = " + (-b / 2 * a));
			}

			else {
				System.out.println("Phuong Trinh Co Hai Nghiem Phan Biet: ");
				System.out.println("x1 =" + (-b + Math.sqrt(delta)) / 2 * a);
				System.out.println("x2 =" + (-b - Math.sqrt(delta)) / 2 * a);
			}

		}
	}

}
