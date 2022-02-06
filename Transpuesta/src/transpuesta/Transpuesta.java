/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transpuesta;

import java.util.Scanner;

/**
 *
 * @author s_eba
 */
public class Transpuesta {

    static Scanner in = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos w = new Metodos();
        int n, m, l, p, A[][], B[][];
        System.out.println("Digite el número de filas da la matriz A");
        n = in.nextInt();
        System.out.println("Digite el número de columnas de la matriz A");
        m = in.nextInt();
        A = new int[n][m];
        w.leerMatriz(A, n, m);
        w.calcularTranspuesta(A, n, m);
        System.out.println("A' es igual a: ");
        w.imprimirMatriz(A, n, m);
    }
}
