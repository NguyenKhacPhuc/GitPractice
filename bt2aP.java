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
public class bt2aP {
    public static void main(String[] args) {
    String chuoi;
    char kyTu;
    boolean a = true;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập vào chuỗi bất kỳ: ");
    chuoi = scanner.nextLine();
     System.out.println("Nhập vào ký tự bất kỳ: ");
     kyTu = scanner.next().charAt(0);
     
     
     for(int i = 0; i <10 ; i++){
         if(kyTu == chuoi.charAt(i)){
             a = true;   
         }
            
         }
        if(a){
            System.out.println("Co");
        }else{
            System.out.println("khong");
        }
     }
    
    }
    
