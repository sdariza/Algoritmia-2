/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producto_matrices;

import java.util.Scanner;

/**
 *
 * @author s_eba
 */
public class Producto_Matrices {

    static Scanner in = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, m, l, p, A[][], B[][], C[][];
        System.out.println("Digite el número de filas de la matriz A");
        n = in.nextInt();
        System.out.println("Digite el número de columnas de la matriz A");
        m = in.nextInt();
        System.out.println("Digite el número de filas de la matriz B");
        l = in.nextInt();
        System.out.println("Digite el número de columnas de la matriz B");
        p = in.nextInt();
        if (m == l) {
            A = new int[n][m];
            B = new int[l][p];
            C = new int[n][p];
            Metodos w = new Metodos();
            w.leerMatriz(A, n, m);
            w.leerMatriz(B, l, p);
            w.matrizNula(C, n, p);
            w.imprimirMatriz(C, n, p);
            w.productoMatrices(A, B, n, m, p, C);
            w.imprimirMatriz(C, n, p);
        } else {
            System.out.println("Las dimensiones no son consistentes");
        }

    }

}
