package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class TaiLieu {
	
	protected String maTaiLieu;
	protected String tenNhaXB;
	protected int soBanPhatHanh;
	
	
	public TaiLieu() {
		super();
		
	}


	public TaiLieu(String maTaiLieu, String tenNhaXB, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenNhaXB = tenNhaXB;
		this.soBanPhatHanh = soBanPhatHanh;
	}
	
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ma Tai Lieu: ");
		maTaiLieu = sc.nextLine();
		
		System.out.println("Nhap Ten Nha Xuat Ban: ");
		tenNhaXB = sc.nextLine();
		
		System.out.println("Nhap So Ban Phat Hanh: ");
		soBanPhatHanh = sc.nextInt();
	
	}


	public void inTT() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "TaiLieu [maTaiLieu=" + maTaiLieu + ", tenNhaXB=" + tenNhaXB + ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}
	

	public void Sua( ArrayList<TaiLieu> list, TaiLieu tailieumoi) {
		
		for(int i = 0  ; i <list.size() ; i++ ) {
			if(list.get(i).maTaiLieu.equals(tailieumoi.maTaiLieu)) {
				list.set(i, tailieumoi);
				
		
				
			}
		}
	}
	
}
