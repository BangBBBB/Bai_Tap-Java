package LamLaiBai2;

import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {
	private int soNha, soThanhVien;
		Scanner sc = new Scanner(System.in);
		
		NhanSu [] ns;
		
	public HoDan() {
	
	}
	
	public HoDan(int soNha, int soThanhVien) {
		
		this.soNha = soNha;
		this.soThanhVien = soThanhVien;
		ns = new NhanSu[soThanhVien];
	}

	public int getSoNha() {
		return soNha;
	}

	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}

	public int getSoThanhVien() {
		ns = new NhanSu[soThanhVien];
		return soThanhVien;
		
	}

	public void setSoThanhVien(int soThanhVien) {
		this.soThanhVien = soThanhVien;
	}

	
	
	public void nhapThongTin() {
		System.out.println("Nhap So Nha : ");
		 soNha =  Integer.parseInt(sc.nextLine());
		 System.out.println("Nhap So Thanh Vien: ");
		 soThanhVien = Integer.parseInt(sc.nextLine());
		 ns = new NhanSu[soThanhVien];
		 
		 for(int i = 0 ; i < soThanhVien ; i++) {
			 System.out.println("Nhap Thanh Vien Thu : "+(i+1));
			 NhanSu  ns1 = new NhanSu();
			 ns1.nhapThongTinNS();
			 ns[i] = ns1;
		 }
	}
	
	
	public void inTT() {
		System.out.println("So Nha: "+soNha);
		System.out.println("So Thanh Vien "+soThanhVien);
		for(int i = 0 ; i< soThanhVien ; i++) {
			System.out.println(ns[i].toString());
		}
	}
	
	
	public void timKiem(ArrayList<HoDan> list,int soNhaTimKiem) {
		int dem = 0 ;
		for(int i = 0 ; i < list.size() ; i++) {
			if(list.get(i).soNha == soNhaTimKiem) {
				dem++;
				list.get(i).inTT();
			}
		}
		if(dem == 0) {
			System.out.println("Khong Tim Thay So Nha Cua Ho Dan");
		}
		
		
	}
	public  int SuaThongTinHoDan( String tenCanSua) {
		int dem = 0;
		for(int i = 0 ; i < ns.length ; i++) {
			if(ns[i].getHoTen().equalsIgnoreCase(tenCanSua)) {
				dem++;
				ns[i].nhapThongTinNS();
			}
		}
		
		return dem;
		
	}
	
	public  int SuaTuoi( String tenCanSua) {
		
		int dem = 0;
		for(int i = 0 ; i < ns.length ; i++) {
			if(ns[i].getHoTen().equalsIgnoreCase(tenCanSua)) {
				System.out.println("Nhap Tuoi Can Sua:");
				int tuoiMoi = sc.nextInt();
				dem++;
				ns[i].setTuoi(tuoiMoi);
			}
		}
		
		return dem;
		
	}
	
}
