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
public class bt3aP {
    public static void main(String[] args) {
        int n, Temp;
        Scanner sc = new Scanner(System.in);
         do {
        System.out.println("Please enter the int number n: ");
        n = sc.nextInt();
    } while (n < 0);
         
   
    int a[] = new int[n];
         
    System.out.println("Enter the element for array: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Enter element number i " + i + ": ");
        a[i] = sc.nextInt();
    }
         
        System.out.println("Array has been entered: ");
    for (int i = 0; i < n; i++) {
        System.out.print(a[i] + "\t");
    }
    
    //sort
     for (int i = 0, j = a.length - 1; i < j; i++, j--){
            Temp = a[i];
            a[i]  = a[j];
            a[j] = Temp;
           
    }
      System.out.println("\nArray after sorting: ");
    for (int i = 0; i < n; i++) {
        System.out.print(a[i] + "\t");
    }
        }
        
    }
    

