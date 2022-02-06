/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcd;

import java.util.Scanner;

/**
 *
 * @author s_eba
 */
public class MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1= 355, n2=150, mcd;
        if (n2 == 0) {
            mcd = n1;
        }else{
            if (n1 % n2 == 0) {
                mcd = n2;
            }else{
                int coc = 0;
                while (n1%n2 != 0) {                    
                    coc = n1%n2;
                    n1 = n2;
                    n2 = coc;
                }
                mcd = coc;
            }
        }
        System.out.println(mcd);
    }
    
}
