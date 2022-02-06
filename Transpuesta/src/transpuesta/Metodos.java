/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transpuesta;

import static transpuesta.Transpuesta.in;

/**
 *
 * @author s_eba
 */
public class Metodos {

    public void leerMatriz(int A[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Escriba el valor de la posción A(" + i + "," + j + ")");
                A[i][j] = in.nextInt();
            }
        }
    }

    public void calcularTranspuesta(int A[][], int n, int m) {
        int t = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (i != j && i < j) {
                    t = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = t;
                }
            }
        }
    }

    public void imprimirMatriz(int A[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + "|");
            }
            System.out.println("");
        }

    }
}
