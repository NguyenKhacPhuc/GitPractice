/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bt {
   public static void main(String[] args){
        int n;
        System.out.println("Xin moi nhap so n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i < n; i ++){
            sum += i;
        }
        System.out.println("Tong cua day so bat dau tu 0 den " + n + " la " + sum );
        
    }
    
}
