package LamLaiBai2;

import java.util.Scanner;

public class NhanSu {
	protected String hoTen;
	protected int namSinh;
	protected int tuoi;
	
	Scanner sc = new Scanner(System.in);
	
	
	public NhanSu() {
		
	}
	public NhanSu(String hoTen, int namSinh, int tuoi) {

		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.tuoi = tuoi;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	
	public void nhapThongTinNS() {
		System.out.println("Nhap Ho Ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap Nam Sinh: ");
		namSinh = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap Tuoi:");
		tuoi = Integer.parseInt(sc.nextLine());
	}
	@Override
	public String toString() {
		return "NhanSu [hoTen=" + hoTen + ", namSinh=" + namSinh + ", tuoi=" + tuoi + "]";
	}
	
}
