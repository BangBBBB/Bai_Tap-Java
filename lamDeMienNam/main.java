package lamDeMienNam;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		QuanLyST qlst = new QuanLyST();
		Scanner sc = new Scanner(System.in) ;
		while(true) {
			MeNu();
			int nhap = Integer.parseInt(sc.nextLine());
			switch(nhap) {
				case 1: 
					qlst.nhapSanPham();
					break;
				case 2:
					qlst.nhapKhachHang();
					break;
				case 3:
					qlst.suaKhachHang();
					break;
				case 4:
					qlst.danhSachSp();
					break;
				case 5:
					qlst.danhsachKH();
					break;
				case 6:
					qlst.muaHang();
					break;
				case 7:
				System.out.println( 
											qlst.khachHangMuaNhieuNhat());
					break;
				case 8:
					qlst.SapXepVaHienThi();
					break;
				case 0:
					return;
				
			}
		}
	}
	public static void MeNu() {
		System.out.println( "1. Nhap San Pham.");
		System.out.println( "2.Them Khach Hang.");
		System.out.println( "3.Thay Doi Ten Hoac Nam Sinh Cua Khach Hang");
		System.out.println( "4.Hien Thi Tat Ca San Pham.");
		System.out.println( "5.Hien Thi Tat ca Khach Hang");
		System.out.println( "6. Mua Hang.");
		System.out.println( "7.Hien Khach Hang Mua Nhieu Tien Nhat.");
		System.out.println( "8.Sap Xep Thu Tu Tang Dan Cua Tien Va In ten KH ra man Hinh");
		System.out.println( "0.Thoat");
	}
}
