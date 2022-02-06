/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma_matrices;

import java.util.Scanner;

/**
 *
 * @author s_eba
 */
public class Suma_Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m, l, p, A[][], B[][];
        System.out.println("Digite el número de filas da la matriz A");
        n = in.nextInt();
        System.out.println("Digite el número de columnas de la matriz A");
        m = in.nextInt();
        A = new int[n][m];
        System.out.println("Digite el número de filas da la matriz B");
        l = in.nextInt();
        System.out.println("Digite el número de columnas de la matriz B");
        p = in.nextInt();
        B = new int[l][p];
        if (n == l && m == p) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.println("Escriba el valor de la posción A(" + i + "," + j + ")");
                    A[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.println("Escriba el valor de la posción B(" + i + "," + j + ")");
                    B[i][j] = in.nextInt();
                }
            }

            int C[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }
            System.out.println("A+B es igual a: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(C[i][j]+"|");
                }
                System.out.println("");
            }
            
        } else {
            System.out.println("Las matrices deben tener las mismas dimensiones");
        }
    }

}
