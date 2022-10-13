import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i <=n; i+=2){
            sum = sum +i;
        }
        System.out.println("sum is: " + sum);
    }
}