/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero_primo;

import java.util.Scanner;

/**
 *
 * @author s_eba
 */
public class Numero_Primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        System.out.println("Por favor, ingresa el número para validar su primalidad");
        
        int num = in.nextInt();
        
        int cont = 1;
        
        for (int i = 2; i <= num; i++) {
            if (num%i == 0) {
                cont = cont + 1;
            }
        }
        
        if (cont > 2) {
            System.out.println("El número"+num + " no es primo");
        }else{
            System.out.println("El número "+num+ " es primo");
        }
    }
}
