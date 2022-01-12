package Bai2;

import java.util.Scanner;

public class TheMuon extends SinhVien {
	private String soPhieuMuon;
	private int ngayMuon;
	private String hanTra;
	private String sohieuSach;
	
	Scanner scan = new Scanner(System.in);
	public TheMuon() {
		
	}
	public TheMuon(String hoTen, int namSinh, int tuoi, String lop, String soPhieuMuon, int ngayMuon, String hanTra,
			String sohieuSach) {
		super(hoTen, namSinh, tuoi, lop);
		this.soPhieuMuon = soPhieuMuon;
		this.ngayMuon = ngayMuon;
		this.hanTra = hanTra;
		this.sohieuSach = sohieuSach;
	}

	public String getSoPhieuMuon() {
		return soPhieuMuon;
	}

	public void setSoPhieuMuon(String soPhieuMuon) {
		this.soPhieuMuon = soPhieuMuon;
	}

	

	public void setNgayMuon(int ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public int getNgayMuon() {
		return ngayMuon;
	}
	public String getHanTra() {
		return hanTra;
	}

	public void setHanTra(String hanTra) {
		this.hanTra = hanTra;
	}

	public String getSohieuSach() {
		return sohieuSach;
	}

	public void setSohieuSach(String sohieuSach) {
		this.sohieuSach = sohieuSach;
	}
	
	
	public void nhapTT() {
		System.out.println("Nhap So Phieu Muon");
		soPhieuMuon = scan.nextLine();
		
		System.out.println("Nhap Ngay Muon");
		ngayMuon = scan.nextInt();
		scan.nextLine();
		
		if(ngayMuon <1 ||ngayMuon > 31) {
			System.out.println("Vui long nhap lai Ngay:");
			ngayMuon = scan.nextInt();
			scan.nextLine();
		}
		System.out.println("Nhap Han Tra ");
		hanTra = scan.nextLine();
		System.out.println("Nhap So Hieu Sach");
		sohieuSach = scan.nextLine();
		System.out.println("Nhap Ho Ten Sinh Vien:");
		hoTen = scan.nextLine();
		System.out.println("Nhap Nam Sinh");
		namSinh = scan.nextInt();
		System.out.println("Nhap Tuoi");
		tuoi = scan.nextInt();
		scan.nextLine();
		System.out.println("Nhap Lop");
		lop = scan.nextLine();
				
	}
	
	
	@Override
	public String toString() {
		return "TheMuon [soPhieuMuon=" + soPhieuMuon + ", ngayMuon=" + ngayMuon + ", hanTra=" + hanTra + ", sohieuSach="
				+ sohieuSach +  ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", tuoi=" + tuoi
				+ ", lop=" + lop + "]";
	}
	
public void hienThi() {
		System.out.println(toString());
	}
	
}
