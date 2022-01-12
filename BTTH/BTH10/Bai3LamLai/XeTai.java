package Bai3LamLai;

import java.util.ArrayList;

public class XeTai extends PTGT  {
	protected double trongTai; // so Luong toi da ma xe tro dc

	public XeTai() {
		
	}

	public XeTai(String soMay, String hangSX, int namSX, double giaban, double trongTai) {
		super(soMay, hangSX, namSX, giaban);
		this.trongTai = trongTai;
	}

	public double getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(double trongTai) {
		this.trongTai = trongTai;
	}
	
	@Override
	public String toString() {
		return "XeTai [trongTai=" + trongTai + ", soMay=" + soMay + ", hangSX=" + hangSX + ", namSX=" + namSX
				+ ", giaban=" + giaban + "]";
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap Trong Tai Cua Xe:");
		trongTai = Double.parseDouble(sc.nextLine());
		
	}
	
	public void hienThi() {
		
		System.out.println(toString());
	}
	public void kiemTraSoMay(ArrayList<PTGT> list1 ,String soMay) {
		
		for(int i = 0 ; i< list1.size() ; i++) {
			 if(list1.get(i).getSoMay().equalsIgnoreCase(soMay)) {// ss xem thang co san co trung vs thang vua nhap k
				 list1.get(i).hienThi();
				
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
