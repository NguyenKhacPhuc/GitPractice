import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao chuoi: ");
		String s = sc.nextLine();
		System.out.print("Nhap vao ki tu: ");
		String c = sc.next();
		if (s.contains(c)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

