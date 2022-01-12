import java.util.Scanner;

public class bai1_Nangcao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap So Canh");
		int n= sc.nextInt();
		if(n <3 || n>4) {
			System.out.println("Vui Long Nhap So Canh [3,4]");
		}
		
		if( n==3) {
			System.out.println("Vui Long nhap 3 canh cua tam giac de tao thanh tam giac nhon");
			System.out.println("Nhap canh Thu Nhat");
			
			int a = sc.nextInt();
			
			System.out.println("Nhap canh Thu Hai");
			int b = sc.nextInt();
			System.out.println("Nhap canh Thu Ba");
			int c = sc.nextInt();
			
			System.out.println("a= "+a+" b= "+b+" c= "+c);
			System.out.println("Chu Vi Tam Giac Nhon La: "+(a+b+c));
		
	}
		if(n == 4) {
			System.out.println("Nhap 4 canh :");
			int a = sc.nextInt();
			
			System.out.println("Nhap canh Thu Hai");
			int b = sc.nextInt();
			System.out.println("Nhap canh Thu Ba");
			int c = sc.nextInt();
			System.out.println("Nhap canh Thu Tu");
			int d = sc.nextInt();
			
			System.out.println("a= "+a+" b= "+b+" c= "+c+" d= "+d);
			if( a== b && b==c && c== d) {
				System.out.println("Tao thanh Hinh Vuong hoac hinh thoi ");
				System.out.println("chu vi = "+(a*4));
			}
			else if( a== c && b== d) {
				System.out.println("Tao thanh Hinh Chu Nhat");
				System.out.println("chu vi = "+(a+c)*2);
			}
			else {
				System.out.println("Tao Thanh Tu Giac  Khong xac dinh--> K Biet chu vi");
				
			}
		}
}}