/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenar_matriz;

import java.util.Scanner;

/**
 *
 * @author s_eba
 */
public class Ordenar_Matriz {
    static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[][] = {{59,13,3},{6,7,9},{2,0,21}, {113,542,12}};
        Metodos w = new Metodos();
        w.imprimirMatriz(A, 4, 3);
        w.ordenarMatrizAscendentemente(A, 4, 3);
        System.out.println("*******MATRIZ ORDENADA");
        w.imprimirMatriz(A, 4, 3);
    }
    
}
