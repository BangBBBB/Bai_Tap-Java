package bai2trongzalo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ThemSuaXoa {

		private List<CanBo> CanBo;
		
		
		public ThemSuaXoa() {
			this.CanBo = new ArrayList<CanBo>();
		}
		
		public void  themCB(CanBo  canbo) {
			this.CanBo.add(canbo);
		}
		
		public List<CanBo> timKiem(String ten){
			return this.CanBo.stream().filter(o -> o.getTen().contains(ten)).collect(Collectors.toList());
		}
		
		public void hienThi() {
			this.CanBo.forEach(o -> System.out.println(o.toString()));
		}
}
