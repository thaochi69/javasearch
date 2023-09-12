/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author Thao Chi
 */
public class Library {
    protected Scanner sc;
    public Library(){
        sc  = new Scanner(System.in);
    }
    
    public String getString(String mes){
        System.out.println(mes);
        return sc.nextLine();
    }
    
        public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);  // chuyển chuỗi số nguyen thành số nguyên
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {  // xu ly ngoai le
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

   
}
