/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenar_matriz;

/**
 *
 * @author s_eba
 */
public class Metodos {

    public void imprimirMatriz(int A[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + "|");
            }
            System.out.println("");
        }
    }

    public void ordenarMatrizAscendentemente(int A[][], int n, int m) {

        int c = 1, t = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = i; k < n; k++) {
                    for (int l = j; l < m; l++) {
                        if (A[i][j] > A[k][l]) {
                            t = A[i][j];
                            A[i][j] = A[k][l];
                            A[k][l] = t;
                        }
                    }
                    c = 0;
                }
            }
        }

    }

}
