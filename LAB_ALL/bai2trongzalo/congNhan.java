package bai2trongzalo;

public class congNhan extends CanBo {
	private int cap;
	 
	 public congNhan(String ten, int namSinh, String gioiTinh, String diaChi, int cap) {
		super(ten, namSinh, gioiTinh, diaChi);
		this.cap = cap;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

@Override
	
	public String toString() {
		return "CongNhan{"+" Cap = '"+cap+'\''+
							",ten = '" + ten+'\''+
							",namSinh = '" + namSinh+'\''+
							",diaChi = '" + diaChi+'\''+
							",gioiTinh = '" +gioiTinh+'\''+'}';
	}
}
