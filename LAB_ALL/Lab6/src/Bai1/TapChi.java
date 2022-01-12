package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class TapChi extends TaiLieu {
	private String soPhatHanh;
	private int thangPhatHanh;
	public TapChi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TapChi(String maTaiLieu, String tenNhaXB, int soBanPhatHanh, String soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNhaXB, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}
	@Override
	public void nhapTT() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap So Phat Hanh: ");
		soBanPhatHanh = scan.nextInt();
		
		System.out.println("Nhap Thang Phat Hanh:");
		thangPhatHanh = scan.nextInt();
		scan.nextLine();
		
		super.nhapTT();
	}
	
	@Override
	public String toString() {
		return "TapChi [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + ", maTaiLieu=" + maTaiLieu
				+ ", tenNhaXB=" + tenNhaXB + ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}
	@Override
	public void inTT() {
		System.out.println(toString());
	}
	
	
	public void timTT(ArrayList<TapChi> list, String soPhatHanh1) {
		int dem = 0;
		for(int i = 0 ; i < list.size(); i++) {
			if(list.get(i).soPhatHanh.equalsIgnoreCase(soPhatHanh1)) {
				list.get(i).inTT();
			}
		}
		if(dem == 0) {
			System.err.println("Dell Co");
		}
	}
	
}
