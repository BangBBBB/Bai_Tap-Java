package Lab0;

import java.util.Scanner;

public class Bai14 {

	/*
	 * Bài 14. Viết chương trình nhập vào vào ma trận A có n dòng, m cột, các phần
	 * tử là những số nguyên lớn hơn 0 và nhỏ hơn 100 được nhập vào từ bàn phím.
	 * Thực hiện các chức năng sau: a) Tìm phần tử lớn nhất của ma trận cùng chỉ số
	 * của số đó. b) Tìm và in ra các phần tử là số nguyên tố của ma trận (các phần
	 * tử không nguyên tố thì thay bằng số 0). c) Sắp xếp tất cả các cột của ma trận
	 * theo thứ tự tăng dần và in kết quả ra màn hình.
	 */

	static int m, n, a[][];

	public static void main(String[] args) {

		NhapMang();
		inMang();

		phanTuLonNhat();

		sxMangTheoCot();
		
		inRaSNT();
	}

	public static void NhapMang() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap So Dong: ");
		n = sc.nextInt();
		System.out.println("Nhap So Cot:");
		m = sc.nextInt();

		a = new int[m][n];
		System.out.println("Vui Long Nhap Cac Phan Tu Cua Mang La Cac So Nguyen >0 & < 100 ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("[ " + i + "," + j + " ] = ");
				a[i][j] = sc.nextInt();
			}
		}
	}

	//

	public static void inMang() {
		System.out.println(" ");
		System.out.println("Mang Co Dang: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println(" ");
		}
	}

	//

	public static void phanTuLonNhat() {

		int max = a[0][0];
		int hang = 0;
		int cot = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
					hang = i;
					cot = j;
				}
			}
		}
		System.out.println("Phan Tu Lon Nhat Trong Mang La: " + max + " Chi so [" + hang + ", " + cot + " ]");
	}

	//

	public static boolean laSNT(int a) {

		if (a == 0 || a == 1) {
			return false;
		}

		else {

			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					return false;
				}
			}
		}

		return true;
	}

	//

	public static void inRaSNT() {
		System.out.println("");
		System.out.println("Mang SNT Co Dang:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (laSNT(a[i][j])) {
					System.out.print(a[i][j] + "   ");
				} else {
					a[i][j] = 0;
					System.out.print(a[i][j] + "  ");
				}
			}
			System.out.println(" ");
		}
	}

	public static void sxMangTheoCot() {
		System.out.print("Mang Sau Khi Sap Xep Theo Cot: ");
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j< n; j++) {
				for(int k = i+1 ; k < m ; k++) {
					if(a[k][j] < a[i][j]) {
						int tmp = a[k][j];
						a[k][j] = a[i][j];
						a[i][j]= tmp;
					}
				}
			}
		}
		inMang();
	}
}
