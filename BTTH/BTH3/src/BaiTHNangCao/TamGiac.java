package BaiTHNangCao;

public class TamGiac extends DaGiac {

	
	@Override
	 public double tinhDienTich() {
		double nuaChuVi = chuVi()/2;
		double dienTich = nuaChuVi*(nuaChuVi -a[0])*(nuaChuVi - a[1])*(nuaChuVi -a[2]);
		return Math.sqrt(dienTich);
	}
}
