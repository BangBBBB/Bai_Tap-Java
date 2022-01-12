package Lab0;

public class Bai2_2 {

	public static void main(String[] args) {
		int sum = 0;
		int dem = 0;
		for (int i = 2;; i += 2) {
			dem++;
			sum += i;
			if (dem == 10) {
				System.out.println(" Tong 10 So Chan Dau Tien La " + sum);
				break;
			}

		}
	}
}
