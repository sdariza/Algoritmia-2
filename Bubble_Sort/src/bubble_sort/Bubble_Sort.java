/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble_sort;

/**
 *
 * @author s_eba
 * Vector ordenado ascendetemente
 */
public class Bubble_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v [] = {6 , 1, -1, 20, 10};
        int n = v.length, t =0;
        System.out.println("Vector son ordenar: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+"|"); 
        }
        System.out.println("");
        for (int i = 0; i < v.length-1; i++) {
            for (int j = i+1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    t = v[i];
                    v[i] = v[j];
                    v[j] = t;
                }
            }
        }
        System.out.println("Vector ordenado: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+"|");            
        }
        System.out.println("");
        
    }
    
}
