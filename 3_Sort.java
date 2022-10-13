import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr;
		System.out.print("Nhap so n: ");
		int n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap so nguyen: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Day so da nhap: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < (n / 2); i++) {
			int temp;
			temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}
		System.out.println("\nCac phan tu duoc sap xep nguoc lai: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
