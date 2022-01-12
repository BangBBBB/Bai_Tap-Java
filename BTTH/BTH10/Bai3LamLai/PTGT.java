package Bai3LamLai;

import java.util.ArrayList;
import java.util.Scanner;





public class PTGT {
	protected String soMay,hangSX;
	 protected int namSX;
	 protected double giaban;
		
		Scanner sc = new Scanner(System.in) ;
	
		
		public PTGT() {
			
		}
		public PTGT(String soMay, String hangSX, int namSX, double giaban) {
		
			this.soMay = soMay;
			this.hangSX = hangSX;
			this.namSX = namSX;
			this.giaban = giaban;
		}
		public String getSoMay() {
			return soMay;
		}
		public void setSoMay(String soMay) {
			this.soMay = soMay;
		}
		public String getHangSX() {
			return hangSX;
		}
		public void setHangSX(String hangSX) {
			this.hangSX = hangSX;
		}
		public int getNamSX() {
			return namSX;
		}
		public void setNamSX(int namSX) {
			this.namSX = namSX;
		}
		public double getGiaban() {
			return giaban;
		}
		public void setGiaban(double giaban) {
			this.giaban = giaban;
		}
		@Override
		public String toString() {
			return "PTGT [soMay=" + soMay + ", hangSX=" + hangSX + ", namSX=" + namSX + ", giaban=" + giaban + "]";
		}
		
		public void nhapThongTin() {
			System.out.println("Nhap So May :");
			soMay = sc.nextLine();
			System.out.println("Nhap Hang SX:");
			hangSX = sc.nextLine();
			System.out.println("Nhap Nam SX: "); 
			namSX = Integer.parseInt(sc.nextLine());
			System.out.println("Nhap Gia Ban:");
			giaban = Double.parseDouble(sc.nextLine());
		}
		
	public void hienThi() {
		System.out.println(toString());
		
	}
		
	public void suaGiaBan(ArrayList<PTGT> list1 , String soMayMoi) {
		for(int i = 0 ; i< list1.size() ; i++) {
			if(list1.get(i).soMay.equalsIgnoreCase(soMayMoi)) {
				System.out.println( "Nhap Gia Ban Moi: ");
				double giaBanMoi = sc.nextDouble();
				list1.get(i).setGiaban(giaBanMoi);
			}
		}
	}

}
