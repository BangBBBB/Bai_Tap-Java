package lamDeMienNam;

import java.util.ArrayList;

public class HoaDon {
	private String maHD;
	private String maKH;
	ArrayList<KhachHang>khs = new ArrayList<>();
	ArrayList<SanPham>sanphams = new ArrayList<>();
	
	public HoaDon() {
	
	}
	public HoaDon(String maHD, String maKH) {
		this.maHD = maHD;
		this.maKH= maKH;
		
	}
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	//================
	public double tongtienHD() {
		double tong = 0;
		for(SanPham sp :sanphams) {
			tong+= sp.getThanhTien();
		}
		return tong;
	}
}
