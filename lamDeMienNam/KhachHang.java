package lamDeMienNam;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private int namSinh;
	private String diaChi,to,phuong,thanhPho;
	ArrayList<HoaDon> hoaDons = new ArrayList<>();
	ArrayList<SanPham>sanphams = new ArrayList<SanPham>();
	Scanner sc = new Scanner(System.in) ;
	
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getPhuong() {
		return phuong;
	}
	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}
	public String getThanhPho() {
		return thanhPho;
	}
	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}
	
	
	public KhachHang() {
		
	}
	public KhachHang(String maKH, String tenKH, int namSinh, String to, String phuong, String thanhPho) {
		
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.namSinh = namSinh;
		this.to = to;
		this.phuong = phuong;
		this.thanhPho = thanhPho;
	}
		//=================================\
		
		public void nhapTTKH() {
			System.out.println( "Nhap Ma Khach Hang: ");
			this.maKH = sc.nextLine();
			System.out.println( "Nhap Ten KH:");
			this.tenKH = sc.nextLine();
			System.out.println( "Nhap Nam Sinh: ");
			this.namSinh = Integer.parseInt(sc.nextLine());
			System.out.println("Nhap To: ");
			this.to= sc.nextLine();
			System.out.println( "Nhap Phuong: ");
			this.phuong= sc.nextLine();
			System.out.println( "Nhap Thannh Pho: ");
			this.thanhPho = sc.nextLine();
			this.diaChi ="To :"+to+" Phuong: "+phuong+" ThanhPho: "+thanhPho;
		}
		@Override
		public String toString() {
			return "KhachHang [maKH=" + maKH + ", tenKH=" + tenKH + ", namSinh=" + namSinh + ", diaChi=" + diaChi + "]";
		}
		
		//===============================\
		
		
		
	public double tongTienKH() {
		double tong = 0;
		for(HoaDon hoadon : hoaDons) {
			 tong+= hoadon.tongtienHD();
		}
		return tong;
	}
		
	
	
	
}
