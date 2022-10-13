import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = n - 1;
        int i = 0;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        i = 0;
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
