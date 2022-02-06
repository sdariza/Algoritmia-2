/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero_perfecto;

/**
 *
 * @author s_eba
 */
public class Numero_Perfecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 8128, cont = 1;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                cont = cont + i;
            }
        }

        if (cont == n) {
            System.out.println("El número " + n + " es perfecto");
        } else {
            System.out.println("El número " + n + " NO es perfecto");

        }
    }

}
