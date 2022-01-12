import java.util.Scanner;

public class Bai4 {
/* Viết chương trình tìm các số nguyên tố nhỏ hơn một số n cho trước
 a. Chỉ sử dụng chu trình for
 b. Chỉ sử dụng chu trình while
 c. Chỉ sử dụng chu trình do-while*/
	
	
	public static  boolean laSNT(int a) {
		if(a<2 ) return false;
		else {
			for(int i = 2 ; i < Math.sqrt(a); i++) {
				if(a%i == 0) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		int k = 0;
//		for(int i= n-1 ; i >=2 ; i--) {
//			if(laSNT(i)) {
//				k = i;
//				break;
//			}
//		}
//		System.out.println("SNT nho hon "+n+" la "+k);
//		
		
		while(true) {
			n--;
			if(laSNT(n)) {
				System.out.println("SNT nho hon la "+n);
				break;
			}
			
		}
		
		do {
			if(laSNT(n)) {
				System.out.println("SNT nho hon la "+n);
				break;
			}
			n--;
		}while(true);
	}
	
}
