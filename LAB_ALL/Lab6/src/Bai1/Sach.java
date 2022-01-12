package Bai1;

import java.util.ArrayList;
import java.util.Scanner;



public class Sach extends TaiLieu {

	private String tenTacGia;
	private int soTrang;
	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sach(String tenTacGia, int soTrang) {
		super();
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}
	@Override
	public void nhapTT() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap Ten Tac Gia:");
		tenTacGia = scan.nextLine();
		System.out.println("Nhap So Trang: ");
		soTrang = scan.nextInt();
		scan.nextLine();
		super.nhapTT();
		
	}
	
	@Override
	public void inTT() {
	
		System.out.println(toString());
		
	}
	@Override
	public String toString() {
		return "Sach [tenTacGia=" + tenTacGia + ", soTrang=" + soTrang + ", maTaiLieu=" + maTaiLieu + ", tenNhaXB="
				+ tenNhaXB + ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}
	
	

	public void timTheoTen(ArrayList<Sach> list, String ten) {
		int dem = 0;
		for(int i = 0  ; i <list.size() ; i++ ) {
			if(list.get(i).tenTacGia.equalsIgnoreCase(ten)) {
				dem++;
				list.get(i).inTT();
			}
		}
		if(dem == 0) {
			System.out.println(" Dell co. ");
		}
	}
}
