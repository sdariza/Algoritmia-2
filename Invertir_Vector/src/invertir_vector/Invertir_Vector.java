/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertir_vector;

import java.util.Scanner;

/**
 *
 * @author s_eba
 */
public class Invertir_Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite la dimensión del vector");
        int n = in.nextInt();
        int v [];
        v = new int [n+1];
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese el valor de la posición "+i);
            v[i] = in.nextInt();
        }
        System.out.print("v= ");
        for (int i = 1; i < v.length; i++) {
            System.out.print(v[i]+"|"); 
        }
        System.out.println("");
        int middle = 0;
        if (n % 2 != 0) {
            middle = (n/2)+1;
        }else{
            middle = n/2;
        }
        int t = 0;
        for (int i = 1; i <= middle; i++) {
            t = v[i];
            v[i] = v[n-(i-1)];
            v[n-(i-1)] = t;
        }
        
        System.out.print("v_inv= ");
        for (int i = 1; i < v.length; i++) {
            System.out.print(v[i]+"|");
        }
        System.out.println("");
    }
}
