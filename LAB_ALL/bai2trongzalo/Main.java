package bai2trongzalo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ThemSuaXoa themSuaXoa = new ThemSuaXoa();

		while (true) {
			System.out.println("1.Nhap Thong Tin Moi Cho Can Bo");
			System.out.println("2.Tim Kiem Theo Ten");
			System.out.println("3.Hien Thi Thong Tin");
			System.out.println("4.Thoat Khoi Chuong Trinh");

			String chon = sc.nextLine();

			switch (chon) {
			case "1":
				System.out.println("a. Nhap Thong Tin Ky Su: ");
				System.out.println("b. Nhap Thong Tin Cong Nhan:");
				System.out.println("c. Nhap Thong Tin Nhan Vien:");
				String type = sc.nextLine();

				switch (type) {
				case "a":{
					System.out.println("Nhap Ten ");
					String ten = sc.nextLine();

					System.out.println("Nhap Nam Sinh ");
					int namSinh = sc.nextInt();

					System.out.println("Nhap Dia Chi ");
					sc.nextLine();
					String diaChi = sc.nextLine();

					System.out.println("Nhap Gioi Tinh ");
					String gioiTinh = sc.nextLine();
					System.out.println("Nhap Nganh Dao Tao ");
					String nganhDaoTao = sc.nextLine();

					CanBo kysu = new kySu(ten, namSinh, gioiTinh, diaChi, nganhDaoTao);
					themSuaXoa.themCB(kysu);
					System.out.println(kysu.toString());
					break;
				}
				case "b":	{
					System.out.println("Nhap Ten ");
					String ten = sc.nextLine();

					System.out.println("Nhap Nam Sinh ");
					int namSinh = sc.nextInt();

					System.out.println("Nhap Dia Chi ");
					sc.nextLine();
					String diaChi = sc.nextLine();

					System.out.println("Nhap Gioi Tinh ");
					String gioiTinh = sc.nextLine();
					
					System.out.println("Nhap Cap ");
					String cap = sc.nextLine();
					
					CanBo congNhan = new congNhan(ten, namSinh, gioiTinh, diaChi, namSinh);
						themSuaXoa.themCB(congNhan);
					break;
					}
				
				case "c" :{
					System.out.println("Nhap Ten ");
					String ten = sc.nextLine();

					System.out.println("Nhap Nam Sinh ");
					int namSinh = sc.nextInt();

					System.out.println("Nhap Dia Chi ");
					sc.nextLine();
					String diaChi = sc.nextLine();

					System.out.println("Nhap Gioi Tinh ");
					String gioiTinh = sc.nextLine();
					
					System.out.println("Nhap Cong Viec ");
					String congviec = sc.nextLine();
					
					CanBo nhanvien =  new NhanVien(ten, namSinh, gioiTinh, diaChi, congviec);
						themSuaXoa.themCB(nhanvien);
						break;
					}
				}
				break;
				
			case "2":
				System.out.println("Nhap Ten Can Tim: ");
				String tenCanTim = sc.nextLine();
				
				themSuaXoa.timKiem(tenCanTim).forEach(congNhan -> {
					System.out.println(congNhan.toString());
				});
				break;
			case "3":
				themSuaXoa.hienThi();
				break;
			case "4":{
				return ;
			}
			default: System.out.println("Vui Long Chon Dung!!!");
			continue;
			}
				
		}

	}

}
