import java.util.Scanner;
public class Bai2 {

    public static void main(String[] args) {
        String a;
        char b;
        boolean c = false;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next().charAt(0);

        for(int i =0; i < a.length();i++){
            if(b == a.charAt(i)) c = true;

        }
        if(c) System.out.println("Tuyệt cà là vời");
        else System.out.println("Ôi bạn ơih");


    }
}
