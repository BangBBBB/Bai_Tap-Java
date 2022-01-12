package bai2trongzalo;


public class NhanVien extends CanBo{
	
	private String congViec; 
	public NhanVien(String ten, int namSinh, String gioiTinh, String diaChi , String congViec) {
		super(ten, namSinh, gioiTinh, diaChi);
		// TODO Auto-generated constructor stub
		this.congViec = congViec;
	}
	public String getCongViec() {
		return congViec;
	}
	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}


	
	@Override
	public String getTen() {
		// TODO Auto-generated method stub
		return super.getTen();
	}
	@Override
	public void setTen(String ten) {
		// TODO Auto-generated method stub
		super.setTen(ten);
	}
	@Override
	public int getNamSinh() {
		// TODO Auto-generated method stub
		return super.getNamSinh();
	}
	@Override
	public void setNamSinh(int namSinh) {
		// TODO Auto-generated method stub
		super.setNamSinh(namSinh);
	}
	@Override
	public String getGioiTinh() {
		// TODO Auto-generated method stub
		return super.getGioiTinh();
	}
	@Override
	public void setGioiTinh(String gioiTinh) {
		// TODO Auto-generated method stub
		super.setGioiTinh(gioiTinh);
	}
	@Override
	public String getDiaChi() {
		// TODO Auto-generated method stub
		return super.getDiaChi();
	}
	@Override
	public void setDiaChi(String diaChi) {
		// TODO Auto-generated method stub
		super.setDiaChi(diaChi);
	}

	@Override
	
	public String toString() {
		return "NhanVien{"+" Cong Viec = '"+congViec+'\''+
							",ten = '" + ten+'\''+
							",namSinh = '" + namSinh+'\''+
							",diaChi = '" + diaChi+'\''+
							",gioiTinh = '" +gioiTinh+'\''+'}';
	}
 }
