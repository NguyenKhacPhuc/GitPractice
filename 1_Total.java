import java.util.Scanner;

public class Total {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so n:  ");
		int number = sc.nextInt();
		int total = 0;
		for (int i = 0; i < number; i++) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		System.out.println("Tong cac so: " + total);
	}
}
