package Bai2;

public class SinhVien {
	String hoTen;
	int namSinh;
	int tuoi;
	String lop;
	
	
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
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	
	public SinhVien() {
		
	}
	public SinhVien(String hoTen, int namSinh, int tuoi, String lop) {
		super();
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.tuoi = tuoi;
		this.lop = lop;
	}
	
	
}
