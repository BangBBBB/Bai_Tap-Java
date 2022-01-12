package BaiTHNangCao;

import java.util.Scanner;

public class DaGiac {
	int soCanh;
	double a[];
	public DaGiac() {
		
	}
	public DaGiac(int soCanh, double[] a) {
		super();
		this.soCanh = soCanh;
		this.a = a;
	}
	public int getSoCanh() {
		return soCanh;
	}
	public void setSoCanh(int soCanh) {
		this.soCanh = soCanh;
	}
	public double[] getA() {
		return a;
	}
	public void setA(double[] a) {
		this.a = a;
	}
	
	
	public void nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap So Canh:");
		 soCanh = scan.nextInt();
		a = new double [soCanh];
		
		for(int i = 0 ; i < soCanh ; i++) {
			System.out.println("Nhap Do Dai Canh:");
			a[i]= scan.nextDouble();
		}
	}
	
	public double chuVi() {
		double chuvi1 = 0;
		for(int i =0 ; i< soCanh ; i++) {
			chuvi1 += a[i];
		}
		return chuvi1;
	}
	
	public void inCanh() {
		for(int i =0 ; i< soCanh ; i++) {
			System.out.println(a[i]);
		}
	}
	
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return 0;
	}
}
