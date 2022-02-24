package lamDeMienNam;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham {
	private String maSanPham;
	private String tenSanPham;
	private double donGia;
	private String ngaySX;
	private double thanhTien;
	private int soLuong;
	ArrayList<HoaDon> hoadons = new ArrayList<>();
	Scanner sc = new Scanner(System.in) ;
	
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(String ngaySX) {
		this.ngaySX = ngaySX;
	}
	
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public double getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien() {
		this.thanhTien = soLuong *donGia;
		
	}
	
	
	
	public SanPham() {
		
	}
	public SanPham(String maSanPham, String tenSanPham, double donGia, String ngaySX, int soLuong) {
		
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.ngaySX = ngaySX;
		
		this.soLuong = soLuong;
		this.thanhTien = soLuong*donGia;
	}
	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", donGia=" + donGia + ", ngaySX="
				+ ngaySX  + ", soLuong=" + soLuong + "]";
	}
	
	//=================================\
	
	
	public void nhapSP() {
		System.out.println( "Nhap Ma SP:");
		this.maSanPham = sc.nextLine();
		System.out.println( "Nhap Ten SP: ");
		this.tenSanPham = sc.nextLine();
		System.out.println( "Nhap Don Gia: ");
	
		this.donGia = Double.parseDouble(sc.nextLine());
		System.out.println( "Nhap So Luong");
		this.soLuong = Integer.parseInt(sc.nextLine());
		System.out.println( "Nhap Ngay San Xuat: ");
		this.ngaySX = sc.nextLine();
		this.thanhTien = this.soLuong*this.donGia;
	}
	
	public void nhapSP1(String maSP) {
	
		System.out.println( "Nhap Ten SP: ");
		this.tenSanPham = sc.nextLine();
		System.out.println( "Nhap Don Gia: ");
		this.donGia = Double.parseDouble(sc.nextLine());
		System.out.println( "Nhap Ngay San Xuat: ");
		this.ngaySX = sc.nextLine();
	}
	public void tangSoLuong(int soLuongTang) {
		this.soLuong+= soLuongTang;
	}
	public void giamSoLuong(int giamSoLuong) {
		this.soLuong -= giamSoLuong;
	}
}
 