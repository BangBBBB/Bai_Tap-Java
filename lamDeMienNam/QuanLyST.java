package lamDeMienNam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuanLyST {
	ArrayList<HoaDon> hoadons = new ArrayList<>();
	ArrayList<KhachHang> khachhangs = new ArrayList<>();
	ArrayList<SanPham> sanPhams = new ArrayList<>();

	Scanner sc = new Scanner(System.in);

	// =============================================
	public void nhapSanPham() {
		System.out.println(" Nhap Ma San Pham: ");
		String maSP = sc.nextLine();
		int index = timViTriSanPham(maSP);
		if (index == -1) {
			SanPham sp = new SanPham();
			sp.nhapSP();;
			sanPhams.add(sp);
		} else {
			System.out.println("Nhap So Luong Can Them:");
			int soLuong = Integer.parseInt(sc.nextLine());
			sanPhams.get(index).tangSoLuong(soLuong);
		}
	}

	public int timViTriSanPham(String masps) {
		for (int i = 0; i < sanPhams.size(); i++) {
			if (sanPhams.get(i).getMaSanPham().equalsIgnoreCase(masps)) {
				return i;
			}
		}
		return -1;
	}
	// ===================================================

	public void nhapKhachHang() {
		KhachHang khachhangms = new KhachHang();
		khachhangms.nhapTTKH();
		khachhangs.add(khachhangms);
	}

	// =========================================
	public void suaKhachHang() {
		System.out.println("Nhap Ma KH Can Sua: ");
		String mkhedit = sc.nextLine();
		int index = timVTKH(mkhedit);
		if(index != -1) {
			System.out.println("1. Sua Ten Khach ");
			System.out.println( "2.Sua Nam Sinh");
			int chon = Integer.parseInt(sc.nextLine());
			if(chon == 1) {
			System.out.println( "Nhap Ten Can Sua:");  
			String tenCanSua = sc.nextLine();
			khachhangs.get(index).setTenKH(tenCanSua);
		}if(chon == 2) {
			System.out.println( "Nhap nam Sinh Can Sua:");
			int namsinh=Integer.parseInt(sc.nextLine());
			khachhangs.get(index).setNamSinh(namsinh);
		}
			}
	}

	public int timVTKH(String maKh) {
		for (int i = 0; i < khachhangs.size(); i++) {
			if (khachhangs.get(i).getMaKH().equalsIgnoreCase(maKh)) {
				return i;
			}
		}
		return -1;
	}
	//====================================================
	
	public void danhSachSp() {
		for (SanPham spin : sanPhams) {
			System.out.println(spin.toString());
			System.out.println( " ");
		}
	}
	
	//=======================
	public void danhsachKH() {
		for (KhachHang khachhangout : khachhangs) {
			System.out.println(khachhangout.toString());
			System.out.println( " ");
		}
	}
	
	//===================================
	public boolean muaHang() {
		System.out.println( "Nhap Ma Khach Hang Can Mua:");
		String maKH = sc.nextLine();
		int vtKH= timVTKH(maKH);
		if(vtKH==-1) {
			System.out.println( "Khach Hang khong ton tai");
			return false;
		}
		
		HoaDon hoaDonMoi = new HoaDon(maKH, maKH+hoadons.size());
		int mua  = 1;
		while(mua ==1 ) {
		System.out.println( "Nhap Ma San Pham Can Mua.");
		String maSP = sc.nextLine();
		int vtSP = timViTriSanPham(maSP);
		if(vtSP != -1 ) {
			SanPham spTrongKho = sanPhams.get(vtSP);
			SanPham spHoaDon = new SanPham(spTrongKho.getMaSanPham(),spTrongKho.getTenSanPham(),spTrongKho.getDonGia(),spTrongKho.getNgaySX(),spTrongKho.getSoLuong());
			
			if(spHoaDon.getSoLuong() <= spTrongKho.getSoLuong()) {
				System.out.println( "Nhap So Luong Can Mua: ");
				int soLuong = Integer.parseInt(sc.nextLine());
				hoaDonMoi.sanphams.add(spHoaDon);
				spTrongKho.giamSoLuong(soLuong);
			}
			
		}else {
			System.out.println( "Khong Tim thay San Pham!");
		}
			System.out.println( "Mua Tiep ?(1/0)");
			mua = Integer.parseInt(sc.nextLine());
		}
		hoadons.add(hoaDonMoi);
		khachhangs.get(vtKH).hoaDons.add(hoaDonMoi);// luu hoa don cua KH Mua
		return true;
	}
		
	//==================================
	
	public String khachHangMuaNhieuNhat() {
		double tienMax= khachhangs.get(0).tongTienKH();
		int vtmax= 0;
		for(int i = 0 ; i< khachhangs.size() ; i++) {
			 double tienKhThuI = khachhangs.get(i).tongTienKH();
			 if(tienMax <tienKhThuI) {
				 tienMax = tienKhThuI;
				 vtmax = i;
			 }
		}
		return khachhangs.get(vtmax).toString();
	}
	public void SapXepVaHienThi() {
		double tientam= khachhangs.get(0).tongTienKH();
		int vtmax= 0;
		
		for(int i = 0 ; i< khachhangs.size() ; i++) {
			 double tienKhThuI = khachhangs.get(i).tongTienKH();
			for(int j = i+1 ; j< khachhangs.size() ; j++) {
				 double tienKhThuj = khachhangs.get(j).tongTienKH();
				 if(tienKhThuI>tienKhThuj) {
					 tientam = tienKhThuj;
					 tienKhThuj = tienKhThuI;
					 tienKhThuI = tientam;
					
					 
				 }
			 }
			 System.out.println( khachhangs.get(i).tongTienKH());
		}
		
	}
}
