package Bai3NC;

import java.util.Scanner;

public class SoPhuc {

	double phanThuc;
	double phanAo;
	public SoPhuc() {
		
	}
	public SoPhuc(double phanThuc, double phanAo) {
		
		this.phanThuc = phanThuc;
		this.phanAo = phanAo;
	}
	
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Phan Thuc");
		phanThuc = sc.nextDouble();
		System.out.println("Nhap Phan Ao");
		phanAo = sc.nextDouble();
		
	}
	void in() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "SoPhuc [phanThuc=" + phanThuc + ", phanAo=" + phanAo + "i]";
	}
	
	String  congSoPhuc (SoPhuc sp) {
		
		double pt = this.phanThuc +sp.phanThuc;
		double pa = this.phanAo+ sp.phanAo;
		
		return "[phanThuc=" + pt + ", phanAo=" + pa + "i]";
	}
	
	String nhanSoPhuc(SoPhuc sp) {
		double pt =(this.phanThuc *sp.phanAo) -(this.phanAo*sp.phanThuc);
		double pa =	(this.phanAo*sp.phanThuc)+(this.phanThuc*sp.phanAo);
		return "[phanThuc=" + pt + ", phanAo=" + pa + "i]";
	}
	
	String chiaSoPhuc(SoPhuc sp) {
		double pt = ((this.phanThuc*sp.phanThuc)+(this.phanAo*sp.phanAo))/(Math.pow(sp.phanThuc,2)+Math.pow(sp.phanAo,2));
		double pa = ((this.phanAo *sp.phanThuc) -(this.phanThuc*sp.phanAo))/(Math.pow(sp.phanThuc,2)+Math.pow(sp.phanAo,2));
		return "[phanThuc=" + pt + ", phanAo=" + pa + "i]";
	}
}
