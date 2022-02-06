/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto_matrices;

import static producto_matrices.Producto_Matrices.in;

/**
 *
 * @author s_eba
 */
public class Metodos {

    public void leerMatriz(int A[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Digite el valor de la matriz en la pos: [" + i + "," + j + "]");
                A[i][j] = in.nextInt();
            }
        }
    }

    public void imprimirMatriz(int A[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j]+"|");
            }
            System.out.println("");
        }
    }
    
    public void matrizNula(int A[][], int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = 0;
            }
        }
    }
    
    
    public void productoMatrices(int A[][], int B[][], int n, int m, int p, int C[][]){
        int ppunto;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                ppunto = 0;
                for (int k = 0; k < m ; k++) {
                    ppunto = ppunto + A[i][k]*B[k][j];
                }
                C[i][j] = ppunto;
            }
        }
    }
}
