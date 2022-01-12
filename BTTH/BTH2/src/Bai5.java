import java.util.Scanner;

public class Bai5 {


	public static void main(String[] args) {
		while(true) {
			
			
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("");
		System.out.println("1.Kiem Tra So Nguyen To.");
		System.out.println("2.Kiem Tra So Hoan Hao.");
		System.out.println("3.Liet Ke So Chinh Phuong.");
		System.out.println("4.Tinh Phan Tu Thu N cua day fibonaci.");
		System.out.println("5.Thoat.");
		
		int chon = sc.nextInt();
		switch(chon) {
		case 1: 
			
			System.out.println("Nhap n: ");
			int n = sc.nextInt();
				if(ktraSNT(n)) {
					System.out.println("La SNT");
				}
				else {
					System.out.println("Khong Phai So Nguyen To");
				}
				break;
		case 2:
			System.out.println("Nhap n: ");
			int a = sc.nextInt();
			for (int i = 1; i <= a/2; i++) {
				if ( a% i == 0) {
					sum += i;
				}
			}
			 if(sum == a) {
					System.out.println("La so Hoan Hao");
			}
				else {
					System.out.println("La so Khong Hoan Hao");
				}
			
			break;
			
			
		case 3:System.out.println("Nhap n: ");
		int b = sc.nextInt();
			System.out.print("Day So Chinh Phuong La:");
			lietKeSoCP(b);
			break;
			
		case 4: 
			System.out.println("Nhap n: ");
			int c = sc.nextInt();
			System.out.println("So FIBONACI Thu "+c+" la: "+fibonaci(c));
			break;
		case 5:
				return ;
		default: System.out.println(" Vui long chon Dung ");
		continue;
		}
	}
	}
	static boolean ktraSNT(int a) {
		if (a < 2)
			return false;
		else {
			for (int i = 2; i < Math.sqrt(a); i++) {
				if (a % i == 0)
					return false;
			}
		}
		return true;
	}

	

	static boolean ktraSoChinhPhuong(int a) {
		for (int i = 1; i < a; i++) {
			if (i * i == a) {
				return true;
			}
		}
		return false;
	}

	
	
	static void lietKeSoCP(int n) {
		
		for(int i = 0 ; i < n ; i++) {
			if(ktraSoChinhPhuong(i)) {
				System.out.print(i+" ");
			}
	
		}
	}
	
	
	public static int fibonaci(int n) {
		int f0 = 0;
		int f1 = 1;
		int fn = 1;
		if(n< 0) {
			return -1;
		}
		else if( n==0|| n== 1 ) {
			return n;
		}
		else {
			for (int i = 2; i < n; i++) {
			f0 = f1;
			f1= fn;
			fn = f0+f1;
			}
		}
		return fn;
	}
	
}
