package Bai3LamLai;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); 
					XeMay xemay;
					Oto ot;
					XeTai xetai;
		
			ArrayList<PTGT> list = new ArrayList<>();
			while(true) {
					System.out.println("MENU--------------- " );
					System.out.println("1.Dang Ky." );
					System.out.println("2.Hien Thi Thong Tin Tat Ca");
					System.out.println("3.Nhap So May Cho Biet Loai Phuong Tien Va In Thong Tin");
					System.out.println("4.Nhap So May Sua Gia Ban" );
					System.out.println("5.Xoa 1 Phuong Tien" );
					System.out.println("6.Xoa Toan Bo Du Lieu");
					System.out.println("7.Thoat" );
					int chon = Integer.parseInt(sc.nextLine());
				
			
				switch(chon) {
				
				// dang ky xe
				case 1:
								System.out.println( "Chon Thich Hop ");
								System.out.println("1.Dang Ky Oto");
								System.out.println("2.Dang Ky Xe Tai");
								System.out.println("3.Dang ky Xe May");
						
								int chon1 = Integer.parseInt(sc.nextLine());
								
								switch(chon1) {
								
									case 1:
										System.out.println( "Nhap Vao So Phuong Tien Can Dang Ky");
										int soPTOT = Integer.parseInt(sc.nextLine());
										for(int i = 0 ; i< soPTOT ; i++) {
											System.out.println("Nhap Oto Thu "+(i+1));
											 ot = new Oto();
											ot.nhapThongTin();
											list.add(ot);
										}
										break;
									case 2:
										System.out.println( "Nhap vao So Phuong Tien Can Dang Ky");
										int soPTXT = Integer.parseInt(sc.nextLine());
										for(int i = 0 ; i< soPTXT; i++) {
												System.out.println( "Nhap Xe Tai Thu "+(i+1));
											 xetai = new XeTai();
											 xetai.nhapThongTin();
											 list.add(xetai);
										}
										break;
									case 3:
										System.out.println( "Nhap vao So Phuong Tien Can Dang Ky");
										int soPTXM = Integer.parseInt(sc.nextLine());
										for(int i = 0 ; i< soPTXM ; i++) {
										System.out.println( "Nhap Xe May Thu "+(i+1));
											 xemay = new XeMay();
											 xemay.nhapThongTin();
											 list.add(xemay);
										}
									break;	
									
									
								}
				
							break;		
							
							
					// hien thi tat ca cac du lieu		
					
				case 2:
					
					int dem = 0;
						for (PTGT ptgt : list) {
						System.out.println(ptgt.toString());
						dem++;
						}
						if(dem == 0) {
							System.out.println("Danh Sach Rong");
						}
							break;	
				case 3:
				// nhap so may cho biet thong tin loai xe, hien thi thong tin xe do
						System.out.println("Nhap So May: ");
						String soMayMoi = sc.nextLine();
						String st1 = "XM";
						String st2 = "XT";
						String st3 = "OT";
				
						boolean check1 = st1.regionMatches(0, soMayMoi, 0, 2); // st1 bau ss o vt thu 0 , so sanh vs soMayMoi, 
																		// so sanh tai vi tri thu 0 cua soMaymoi, kieu ss la 2 ky tu
						boolean check2 = st2.regionMatches(0, soMayMoi, 0, 2);
						boolean check3 = st3.regionMatches(0, soMayMoi, 0, 2);
					
						if(check1 == true) {
							System.out.println( "Day La Xe May ");
							System.out.println("Thong Tin Cua Xe La:");
							xemay = new XeMay();
							xemay.kiemTraSoMay(list, soMayMoi);
						}
						else if(check2 == true) {
							System.out.println( "Day La Xe Tai ");
							System.out.println( "Thong Tin Cua Xe La: ");
							xetai = new XeTai();
							xetai.kiemTraSoMay(list, soMayMoi);
						}
						else if(check3 == true) {
							System.out.println( "Day La OTO ");
							System.out.println( "Thong Tin Cua Xe La: ");
							ot = new Oto();
							ot.kiemTraSoMay(list, soMayMoi);
						
						}
						
					break;
					
					// nhap so May de thay doi gia Tien
				case 4:
					
						System.out.println( "Nhap So May De Thay Doi Gia Tien: ");
						String soMaymoi = sc.nextLine();
						for (PTGT ptgt : list) {
							ptgt.suaGiaBan(list, soMaymoi);
						}
						break;
						
						
						//xoa 1 may dua vao so may
				case 5:
					System.out.println( "Nhap So May De Xoa: ");
					String soMayXoa = sc.nextLine();
					for(int i = 0 ; i< list.size() ; i++) {
						if(list.get(i).getSoMay().equals(soMayXoa)) {
							list.remove(i);
						}
					}
					break;
					
					// xoa Toan Bo du Lieu
				case 6:
					
						for(int i = 0 ; i< list.size() ; i++) {
							list.clear();
						}
						break;
						
				case 7:
					return;
				default:
					System.out.println( "Vui Long Chon Dung.");
					continue;
				}
		
	}
	}
}
