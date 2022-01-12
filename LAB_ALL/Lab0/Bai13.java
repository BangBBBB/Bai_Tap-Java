package Lab0;

import java.util.Scanner;

public class Bai13 {
	/*Bài 13. Cho ma trận số nguyên cấp n x m. Cài đặt các hàm thực hiện các chức năng sau:
a) Nhập ma trận.
b) In ma trận.
c) Tìm phần tử nhỏ nhất.
d) Tìm phần tử lẻ lớn nhất.
e) Tìm dòng có tổng lớn nhất. */
	static int m, n, arr[][];

	public static void main(String[] args) {
		
		nhapMang();
		xuatMang();
		int leMin = phanTuLeNhoNhatTrongMang();
		System.out.println("Phan Tu Nho Nhat Trong Mang La: "+minTrongMang());
		
		if(leMin == 0) {
			System.out.println("Khong co Phan Tu Le");
		}
		else {
		System.out.println("Phan Tu Le Nho Nhat Trong Mang La: "+leMin);
		}
		
		System.out.println("Phan Tu Le Lon Nhat Trong Mang La: "+phanTuLeLonNhatTrongMang());
		
		tongHangKetQua();
	}
	

	public static void nhapMang() {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Nhap So Dong: ");
		m = sc.nextInt();
		System.out.println("Nhap So Cot:");
		n = sc.nextInt();
		
		arr = new int [m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("arr["+i+","+j+"]=");
				arr[i][j] = sc.nextInt();
			}
			System.out.println("");
		}
	}
	
	
	public static void xuatMang() {
		System.out.println("Mang Co Dang: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]+"  ");
				
			}
			System.out.println();
		}
	}
	
	
	//
	public static int minTrongMang() {
		int min = arr[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(min> arr[i][j]) {
					min = arr[i][j]; 
				}
			}
		}
		return min;
	}
	
	
	//
	public static int phanTuLeNhoNhatTrongMang() {
		int tmp = 0;
		for(int i = 0 ; i < m ; i++) {
			for (int j = 0; j < n; j++) {
				if(arr[i][j]%2 == 1) {
					tmp = arr[i][j];
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(tmp> arr[i][j] && arr[i][j]%2 ==1 ) {
					tmp = arr[i][j];
				}
		}
	}
		return tmp;
}
	
	//
	public static int phanTuLeLonNhatTrongMang() {
		int acs = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(acs < arr[i][j] && arr[i][j]%2 ==1 ) {
					acs = arr[i][j];
				}
			}
		}	
		return acs;
	}
	
	
	//
	public static int tongHang(int i) {
		int tong = 0;
		for(int j = 0 ; j< m ; j++) {
			tong += arr[i][j];
		}
		return tong;
	}
	
	public static void tongHangKetQua() {
		
		int max = tongHang(0), count = 0;
		for(int i = 0 ; i < m ; i ++) {
			if( max<tongHang(i)) {
				max = tongHang(i);
				count = i;
			}
		}
		System.out.println("Dong Co Tong Lon Nhat La: "+(count+1) +" Co Gia Tri= "+max);
	}	
}
		

