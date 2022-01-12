package Bai2;

public class Diem {
	double x, y;

	public Diem() {
		
	}

	public Diem(double x1, double y1) {
		
		this.x = x1;
		this.y = y1;
	}
	
	public void inTTDiem() {
		System.out.println("x = "+x+" y = "+y);
	}
	
	public double tinhKhoangCach(Diem d) {
		double hoanhDo = Math.pow(d.x-this.x, 2);
		double tungDo	= Math.pow(d.y-this.y,2);
		double khoangCach = Math.sqrt(hoanhDo+tungDo);
		return khoangCach;
	}
}
