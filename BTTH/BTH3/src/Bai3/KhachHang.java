package Bai3;

public class KhachHang {
	String hoTenChuHo;
	int soNha;
	String maSoCongTo;
	
	
	public KhachHang() {
		
	}
	
	public String getHoTenChuHo() {
		return hoTenChuHo;
	}
	public KhachHang(String hoTenChuHo, int soNha, String maSoCongTo) {
		super();
		this.hoTenChuHo = hoTenChuHo;
		this.soNha = soNha;
		this.maSoCongTo = maSoCongTo;
	}
	public void setHoTenChuHo(String hoTenChuHo) {
		this.hoTenChuHo = hoTenChuHo;
	}
	public int getSoNha() {
		return soNha;
	}
	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}
	public String getMaSoCongTo() {
		return maSoCongTo;
	}
	public void setMaSoCongTo(String maSoCongTo) {
		this.maSoCongTo = maSoCongTo;
	}
	
	
}
