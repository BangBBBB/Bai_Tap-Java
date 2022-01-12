package Bai1;

import java.util.Scanner;

public class Nguoi {
	String hoTen ;
	String diaChi;
	int namSinh;
	
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ho Ten ");
		hoTen= sc.nextLine();
		System.out.println("Nhap Dia Chi ");
		diaChi = sc.nextLine();
		System.out.println("Nhap Nam Sinh");
		namSinh = sc.nextInt();
		sc.nextLine();
	}
	
	
	@Override
	public String toString() {
		return "Nguoi [hoTen=" + hoTen + ", diaChi=" + diaChi + ", namSinh=" + namSinh + "]";
	}
	public void inTT() {
		System.out.print(hoTen+"\t");
		System.out.print(diaChi+"\t");
		System.out.print(namSinh+"\t");
		System.out.println("");
	}
}
