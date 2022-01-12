package BaiTHNangCao;

public class main {
	public static void main(String[] args) {
		DaGiac dg = new DaGiac();
		TamGiac tg = new TamGiac();
		dg.nhap();
		dg.inCanh();
		System.out.println("Chu Vi Tam Giac Do La: "+dg.chuVi());
		
		
		System.out.println("Dien Tich Tam Giac Do La: "+tg.tinhDienTich());
		
	}
}
