package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {


	public static void main(String[] args) {
	
		Sach sach = new Sach();
		TapChi tapchi = new TapChi();
		Bao bao = new Bao();
		
		ArrayList<Sach> s = new ArrayList<Sach>();
		ArrayList<Bao> b = new ArrayList<Bao>();
		ArrayList<TapChi> t = new ArrayList<TapChi>();
		
		System.out.println("1.Nhập thông tin về các tài liệu");
		System.out.println("2.Hiển thị thông tin về các tài liệu");
		System.out.println("3.Tìm kiếm tài liệu theo loại");
		System.out.println("4.Thoát khỏi chương trình");
		while (true) {
		Scanner scan = new Scanner(System.in);
		int chon = scan.nextInt();
		
		switch(chon) {
		
		case 1:
			System.out.println("1.Nhap Thong Tin Sach");
			System.out.println("2.Nhap Thong Tin Tap Chi");
			System.out.println("3.Nhap Thong Tin Bao");
			int a= scan.nextInt();
			switch(a) {
			
			case 1: 
				
				sach.nhapTT();
				s.add(sach);
				break;
			case 2: 
				tapchi.nhapTT();
				t.add(tapchi);
				break;
			case 3: 
				bao.nhapTT();
				b.add(bao);
				break;
			}
			break;
		case 2:
			
			System.out.println("1.Hien Thi Thong Tin Sach");
			System.out.println("2.Hien Thi Thong Tin Tap Chi");
			System.out.println("3.Hien Thi Thong Tin Bao");
			
			int c = scan.nextInt();
			
			switch(c) {
			
				case 1: 
					for (Sach Sach1 : s) {
						Sach1.inTT();
					}
				break;
				case 2:
					for (TapChi tapChi2 : t) {
						tapChi2.inTT();
					}
					break;
				case 3:
					for (Bao bao1 : b) {
						bao1.inTT();
					}
					break;
			}
			break;
		case 3:
			System.out.println("Nhap Ten Loai Can Tim Kiem:");
			System.out.println("1.Sach");
			System.out.println("2.Bao");
			System.out.println("3.Tap Chi");
			int f = scan.nextInt();
			switch(f){
			case 1: 
				scan.nextLine();
				System.out.println("Tim Theo Ten Tac Gia ");
				System.out.println("Nhap Ten Can Tim: ");
				String tenCanTim = scan.nextLine();
				sach.timTheoTen(s, tenCanTim);
				break;
			case 2:
				System.out.println(" Tim Theo Ngay Phat Hanh");
				System.out.println("Nhap Ngay: ");
				int x = scan.nextInt();
				
				bao.timTT(b, x);
				break;
				
			case 3:
				scan.nextLine();
				System.out.println("Tim Theo So Phat Hanh");
				System.out.println("Nhap So Phat Hanh Ban Tim Kiem:");
				String l = scan.nextLine();
				tapchi.timTT(t, l);
				break;
			}
			 
			break;
		case 4:
			return;
		default : 
			System.out.println("Nhap Đúng Vào DCMM");
			continue;
	}
	}
	}
}
