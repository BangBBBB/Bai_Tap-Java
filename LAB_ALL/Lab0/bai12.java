package Lab0;

import java.util.Scanner;

/*Bài 12. Viết chương trình nhập vào một mảng số nguyên có n phần tử
a) Xuất giá trị các phần tử của mảng.
b) Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
c) Đếm số phần tử là số chẵn
d) Tìm các phần tử là số nguyên tố.
e) Sắp xếp mảng tăng dần
f) Tìm phần tử có giá trị x */
public class bai12 {
	final int Max = 100;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhap So Phan Tu Cua Mang");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Nhap Mang: ");
		InPutArr(a, n);
		System.out.println("Mang Da Nhap La: ");
		OutPutArr(a, n);
		
		maxMin(a, n);
		
		demPhanTuChan_le(a, n);
		
		inRaCacSNT(a, n);
		
		sxMangTangDan(a, n);
		OutPutArr(a, n);
		
		sxMangGiamDan(a, n);
		OutPutArr(a, n);
		timKiemPhanTu(a, n);

	}

	// Nhap Mang

	public static void InPutArr(int[] a, int n) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

	}
	// xuat Mang

	public static void OutPutArr(int[] a, int n) {

		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	// tim Max Min

	public static void maxMin(int[] a, int n) {
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("");
		System.out.println("Max = " + max + " Min = " + min);

	}

	// Dem so phan Tu Chan Le

	public static void demPhanTuChan_le(int a[], int n) {
		int dem1 = 0;
		int dem2 = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				dem1++;
			} else {
				dem2++;
			}
		}
		System.out.println("So Phan Tu Chan La: " + dem1);
		System.out.println("So Phan Tu Le La: " + dem2);
	}

	// Dinh danh so NT

	public static Boolean laSnT(int a) {
		if (a < 2) {
			return false;
		} else {
			int can = (int) Math.sqrt(a);
			for (int i = 2; i <= can; i++) {
				if (a % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	// In ra cac SNT Trong Bang

	public static void inRaCacSNT(int a[], int n) {
		System.out.println("Cac So Nguyen To Trong Mang La: ");
		for (int i = 0; i < n; i++) {
			if (laSnT(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
	}

	// Sx Mang Tang Dan

	public static void sxMangTangDan(int a[], int n) {
		System.out.println("");
		System.out.println("Mang Duoc Sap Xep Tang Dan La: ");

		for (int i = 0; i < n - 1; i++) {
			int tmp = a[i];
			for (int j = i + 1; j < n; j++) {
				if (tmp > a[j]) {
					a[i] = a[j];
					a[j] = tmp;
					tmp = a[i];
				}
			}
		}
	}

	// sx Mang Giam Dan

	public static void sxMangGiamDan(int a[], int n) {
		System.out.println("");
		System.out.println("Mang Duoc Sap Xep Giam Dan La: ");

		for (int i = 0; i < n - 1; i++) {
			int tmp = a[i];
			for (int j = i + 1; j < n; j++) {
				if (tmp < a[j]) {
					a[i] = a[j];
					a[j] = tmp;
					tmp = a[i];
				}
			}
		}
	}

	// Tim Kiem Phan Tu trong Mang
		public static void timKiemPhanTu( int a[], int n) {
			Scanner scan = new Scanner(System.in);
			System.out.println("");
			System.out.println("Nhap Phan Tu Can Tim Kiem:");
			int k = scan.nextInt();
			
			for(int i = 0 ; i < n ; i++ ) {
				if( k == a[i]) {
					System.out.println("Phan Tu "+ k +" Nam O Vi Tri Thu "+i+"Trong Mang");
				}
				else {
					System.out.println(" Khong Co Phan Tu "+k+" Trong Mang");
					break;
				}
			}
		}
}
