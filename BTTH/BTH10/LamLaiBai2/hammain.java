package LamLaiBai2;

import java.util.ArrayList;
import java.util.Scanner;

public class hammain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList< HoDan> hd1 = new ArrayList<HoDan>();
		HoDan hd22 = new HoDan();
		while(true) {
			System.out.println("Menu----------------");
			System.out.println("1.Nhap Mot Day Ho Dan");
			System.out.println("2.Hien Thi Thong Tin Ve Cac Ho Dan");
			System.out.println("3.Tim Kiem Ho Dan");
			System.out.println("4.Chinh Sua Ho Dan");
			System.out.println("5.Sua Tuoi theo ten Nhap Vao");
			System.out.println("6.Xoa Mot Ho Dan");
			System.out.println("0. Thoat");
			int n= sc.nextInt();
			switch(n) {
					case 1:
						System.out.println("Nhap So Ho Dan Can Dang Ky");
							int soHD = sc.nextInt();
							for(int i = 0 ; i< soHD ; i++) {
								System.out.println("Nhap Ho Dan Thu "+(i+1));
								HoDan hd = new HoDan();
								hd.nhapThongTin();
								hd1.add(hd);
							}
						break;
					case 2: 
						for (HoDan hd : hd1) {
							hd.inTT();
						}
						break;
					case 3: 
							System.out.println("Nhap So Nha Can Tim Kiem:");
								int soNhaTimKiem = sc.nextInt();
								HoDan hd2 = new HoDan();
								hd2.timKiem(hd1, soNhaTimKiem);
								break;
					case 4:
							sc.nextLine();
							System.out.println("Nhap Ten Can Sua:");
							String tenCanSua = sc.nextLine();
							int dem =0;
							for (HoDan x : hd1) {
								if(x.SuaThongTinHoDan(tenCanSua) != 0) {
									dem++;
								}
								
							}
							if(dem == 0) {
								System.out.println("Chua Tim Thay");
							}
							
							break;
					case 5: 
						sc.nextLine();
						System.out.println("Nhap ten : ");
						String tenCanSua2 = sc.nextLine();
							for (HoDan hoDan : hd1) {
								hoDan.SuaTuoi(tenCanSua2);
							}
							break;
					case 6:
							System.out.println("Nhap So Nha:");
							int soNhaDeXoa = sc.nextInt(); 
							for(int i = 0 ; i <hd1.size(); i++) {
								if(hd1.get(i).getSoNha() == soNhaDeXoa ) {
									hd1.remove(i);
								}
							}
//							for (HoDan x : hd1) {
//								if(x.getSoNha() == soNhaDeXoa) {
//									hd1.remove(x);
//								}
//								else {
//									System.out.println("Khong tim thay so nha");
//								}
//							}
							break;
					case 0:
						return;
					default :
						System.out.println("Vui Long Chon Dung");
							continue;
					
			}
		}
	}
}
