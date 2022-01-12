import java.util.Scanner;

public class nhapThapInNhi {

	public static void main(String[] args) {
		System.out.println("Nhap So Thap Phan");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.print("He nhi phan cua "+a+" la : ");
		System.out.println(Integer.toBinaryString(a));// cach 1
		
		String nhiPhan= "";
		while(a>0) {
			nhiPhan = (a%2)+ nhiPhan;
			a = a/2;
		}
		System.out.print("He nhi phan la"+nhiPhan);//cach 2
		
	}
	
}
