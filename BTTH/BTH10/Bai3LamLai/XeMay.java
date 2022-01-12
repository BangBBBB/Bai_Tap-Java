package Bai3LamLai;

import java.util.ArrayList;

public class XeMay extends PTGT{

	protected double congSuat; // don vi kw so vong tren phut

	public XeMay() {
		
	}

	public XeMay(String soMay, String hangSX, int namSX, double giaban, double congSuat) {
		super(soMay, hangSX, namSX, giaban);
		this.congSuat = congSuat;
	}

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}

	@Override
	public String toString() {
		return "XeMay [congSuat=" + congSuat + ", soMay=" + soMay + ", hangSX=" + hangSX + ", namSX=" + namSX
				+ ", giaban=" + giaban + "]";
	}
	
	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap Cong Suat: ");
		congSuat = Double.parseDouble(sc.nextLine());
	}
	
	public void hienThi() {
		System.out.println(toString());
	}
	public void kiemTraSoMay(ArrayList<PTGT> list1 , String SoMay) {
	
		for(int i = 0 ; i< list1.size() ; i++) {
			if(list1.get(i).getSoMay().equalsIgnoreCase(SoMay)) {// ss xem thang co san co trung vs thang vua nhap k
				list1.get(i).hienThi();// hien thi thang co san trong mang (vi no trung vs thang tim kiem)
			}
		}
		
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
