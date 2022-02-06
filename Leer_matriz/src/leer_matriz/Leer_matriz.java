/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leer_matriz;

import java.util.Scanner;

/**
 *
 * @author s_eba
 */
public class Leer_matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m, A[][];
        System.out.println("Digite el número de filas");
        n = in.nextInt();
        System.out.println("Digite el número de columnas");
        m = in.nextInt();
        A = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Escriba el valor de la posción A(" + i + "," + j + ")");
                A[i][j] = in.nextInt();
            }
        }

        System.out.println("La matriz leída está formada por los siguientes elementos:");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] +"|");
            }
            System.out.println("");
        }
        
    }
    
}
