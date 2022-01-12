package Lab1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		timUCLN();
		System.out.println(" Nhap Thu Tu Cua So Can Tim: ");
		int n = scan.nextInt();
		
		 System.out.println("So FIBONACI Thu "+n+" la :"+Fibonaci(n));
	}
	
	public static void timUCLN() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap Hai So :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		 int c = (a>b?a:b);
		 int d = (a<b?a:b);
		if(a < b || b< a) {
			for( int i = c; i>0 ; i--) {
				if(c % i == 0 &&  d%i== 0) {
					System.out.println(i+" La UCLN");
					break;
				}
			}
		}
	}
	
	
	public static int Fibonaci(int n) {
		
		int f0 = 0;
		int f1 = 1;
		int fn = 1;
		
		if(n < 0) {
			return -1;
		}
		else if(n == 0 || n ==1) {
			return n;
		}
		else {
				for(int  i = 2; i < n ; i++) {
					 f0 = f1;
					 f1= fn;
					 fn = f0+f1;
				}
		}
		return fn;
	}
}
