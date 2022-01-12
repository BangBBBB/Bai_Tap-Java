import java.util.Scanner;

public class Bai6 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n:");
		int n = sc.nextInt();
		
		tongGiaiThua(n);
		
		
		if(n%2 == 1) {
			tongLe(n);
		}
		else {
			tongChan(n);
		}
		
		tongDay(n);
		
	}
	
	static int giaiThua(int n) {
		if(n ==1 ) return 1;
		return (n*giaiThua(n-1));
	}
	
	 static void tongGiaiThua(int n) {
		int sum = 0;
		for(int i = 1; i <= n ; i ++) {
			sum+= giaiThua(i);
		}
		System.out.println("Tong Giai Thua La "+sum);
	}
	 
	 static void tongLe(int n) {
		 int sum = 0;
		 for(int i = 0 ; i < n ; i++) {
			 if(i%2 == 1) {
				 sum+= i;
			 }
		 }
		 System.out.println("Tong Cac So Le Nho Hon "+n+" La: "+sum);
	 }
	 
	 static void tongChan(int n) {
		 int sum = 0;
		 for(int i = 0 ; i < n ; i++) {
			 if(i%2 == 0) {
				 sum+= i;
			 }
		 }
		 System.out.println("Tong Cac So Chan Nho Hon "+n+" La: "+sum);
	 }
	 
	 static void tongDay(int n) {
		 float sum = 0;
		 for(int i = 1 ; i < n ; i++) {
			
				 sum+= (float)i/(i+1);
			
		 }
		 System.out.println("Tong Day La: "+sum);
	 }
}
