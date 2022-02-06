/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector_de_primos;

import java.util.ArrayList;

/**
 *
 * @author s_eba
 */
public class Vector_de_Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            int cont = 1;
            for (int j = 2; j <= i; j++) {
                if (i%j == 0) {
                    cont = cont + 1;
                }
            }

            if (cont == 2) {
                v.add(i);
            }
        }
        
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i)+"|");
        }

    }
    
}
