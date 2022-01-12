package Bai3;

import java.util.Scanner;


public class BienLai extends KhachHang {

	int chiSoCu;
	int chiSoMoi;
	
	public int getChiSoCu() {
		return chiSoCu;
	}
	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	public int getChiSoMoi() {
		return chiSoMoi;
	}
	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}
	public BienLai() {
	}
	public BienLai(String hoTenChuHo, int soNha, String maSoCongTo, int chiSoCu, int chiSoMoi) {
		super(hoTenChuHo, soNha, maSoCongTo);
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
	}
	
	void nhap() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap Ho Ten Chu Ho : ");
		hoTenChuHo = sc.nextLine();
		System.out.println("Nhap So Nha: ");
		soNha = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap Ma So Cong To Dien: ");
		maSoCongTo = sc.nextLine();
		System.out.println("Nhap Chi So Cu: ");
		chiSoCu = sc.nextInt();
		System.out.println("Nhap Chi So Moi:");
		chiSoMoi = sc.nextInt();
	}
	
	public void hienThi() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "BienLai [chiSoCu=" + chiSoCu + ", chiSoMoi=" + chiSoMoi + ", hoTenChuHo=" + hoTenChuHo + ", soNha="
				+ soNha + ", maSoCongTo=" + maSoCongTo + "]"+"TienDienPhaiTra = "+((double) chiSoMoi - chiSoCu)*850000;
	}
	
}
