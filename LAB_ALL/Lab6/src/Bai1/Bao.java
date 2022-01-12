package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bao extends TaiLieu{
	private int ngayPhatHanh;

	public Bao() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Bao(int ngayPhatHanh) {
		super();
		this.ngayPhatHanh = ngayPhatHanh;
	}


	@Override
	public void nhapTT() {
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Nhap Ngay Phat Hanh");
			ngayPhatHanh = scan.nextInt();
		}while(ngayPhatHanh>31);
		super.nhapTT();
	}


	@Override
	public void inTT() {
		System.out.println(toString());
	}


	@Override
	public String toString() {
		return "Bao [ngayPhatHanh=" + ngayPhatHanh + ", maTaiLieu=" + maTaiLieu + ", tenNhaXB=" + tenNhaXB
				+ ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}
	
	public void timTT(ArrayList<Bao> list , int ngay) {
		int dem = 0;
		for(int i = 0 ; i< list.size(); i++) {
			if(list.get(i).equals(ngay)) {
				list.get(i).inTT();
			}
		}
		if(dem == 0 ) {
			System.out.println("Dell Co");
		}
	}
	
}
