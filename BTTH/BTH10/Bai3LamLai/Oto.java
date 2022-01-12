package Bai3LamLai;

import java.util.ArrayList;

public class Oto extends PTGT {
	protected int soChoNgoi;
	protected String kieuDongCo;

	public Oto() {

	}

	public Oto(String soMay, String hangSX, int namSX, double giaban, int soChoNgoi, String kieuDongCo) {
		super(soMay, hangSX, namSX, giaban);
		this.soChoNgoi = soChoNgoi;
		this.kieuDongCo = kieuDongCo;
	}

	public int getSoChoNgoi() {
		return soChoNgoi;
	}

	public void setSoChoNgoi(int soChoNgoi) {
		this.soChoNgoi = soChoNgoi;
	}

	public String getKieuDongCo() {
		return kieuDongCo;
	}

	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}

	@Override
	public String toString() {
		return "Oto [soChoNgoi=" + soChoNgoi + ", kieuDongCo=" + kieuDongCo + ", soMay=" + soMay + ", hangSX=" + hangSX
				+ ", namSX=" + namSX + ", giaban=" + giaban + "]";
	}

	@Override
	public void nhapThongTin() {
		super.nhapThongTin();
		System.out.println("Nhap So Cho Ngoi:");
		soChoNgoi = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap Kieu Dong Co:");
		kieuDongCo = sc.nextLine();
	}

	@Override
	public void hienThi() {
		System.out.println(toString());
	}

	public void kiemTraSoMay(ArrayList<PTGT> list1, String soMayMoi) {
		
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i).getSoMay().equalsIgnoreCase(soMayMoi)) { // ss xem thang co san co trung vs thang vua nhap k
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
