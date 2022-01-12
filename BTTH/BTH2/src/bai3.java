import java.util.Scanner;

public class bai3 {
	final static int minNam = 1900,maxNam = 10000; 
	
	
	public static int soNgayTrongThang(int thang, int nam) {
		int SumNgay= 0;
		switch(thang) {
		case 1: case 3: case 5: case 7: case 8: case 10 : case 12:
			SumNgay = 31;
			break;
		case 4: case 6: case 9: case 11:
			SumNgay = 30;
		break;
		case 2: 
			SumNgay = (nam%4 == 0 &&nam%100 != 0|| nam %400 == 0 )?29:28;
			break;
		}
		return SumNgay;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ngay, thang, nam;
		
		while(true) {
			System.out.println("Nhap Nam ");
			nam = sc.nextInt();
			if(nam< minNam || nam >maxNam) {
				System.out.println("Nhap Du Lieu Khong Hop Le");
				continue;
				
				}
			else {
				break;
				}
			}
		
		while(true) {
			System.out.println("Nhap Thang");
			thang = sc.nextInt();
			if(thang < 1 || thang > 12) {
				System.out.println("Khong Hop Le");
				continue;
			}
			else break;
		}
		
		int tongNgayinThang = soNgayTrongThang( thang, nam);
		while(true) {
			System.out.println("Nhap Ngay");
			ngay = sc.nextInt();
			
			if(ngay<1 || ngay>tongNgayinThang ) {
				System.out.println("Khong Hop Le");
				continue;
			}
			else break;
		}
		
		int ngayThu = ngay;
		for(int i = 1 ; i < thang; i++) {
			switch(i) {
			case 1: case 3: case 5: case 7: case 8: case 10 : case 12:
				ngayThu += 31;
				break;
			case 4: case 6: case 9: case 11:
				ngayThu += 30;
				break;
			case 2:
				ngayThu +=  (nam%4 == 0 &&nam%100 != 0|| nam %400 == 0 )?29:28;
				break;
				default: ngayThu += 31;
			}
			
		}
		System.out.println("La Ngay Thu "+ngayThu+" Trong Nam ");
	}
}
