package bai2trongzalo;

public class kySu extends CanBo{
	
	
	private String nganhDaoTao;
	
	public kySu(String ten, int namSinh, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(ten, namSinh, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
@Override
	
	public String toString() {
		return "KySu{"+" nganhDaoTao = '"+nganhDaoTao+'\''+
							",ten = '" + ten+'\''+
							",namSinh = '" + namSinh+'\''+
							",diaChi = '" + diaChi+'\''+
							",gioiTinh = '" +gioiTinh+'\''+'}';
	}
}
