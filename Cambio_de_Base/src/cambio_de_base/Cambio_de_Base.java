/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambio_de_base;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author s_eba
 * Dado un número en base B1, pasarlo a base B2, donde B1 y B2 son <= 10
 */
public class Cambio_de_Base {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger B1, B2, N;
        System.out.println("Digite el número");
        N = in.nextBigInteger();
        System.out.println("Digite la base  B1");
        B1 = in.nextBigInteger();
        System.out.println("Digite la base B2");
        B2 = in.nextBigInteger();
        int exp = 0;
        BigInteger numB10 = BigInteger.ZERO, extrac, num = N, num_i;
        BigInteger bigInteger10 = new BigInteger("10");
        while (!num.equals(BigInteger.ZERO)) {            
            extrac = num.divide(bigInteger10);
            num_i = num.subtract(extrac.multiply(bigInteger10));
            numB10 = numB10.add(num_i.multiply(B1.pow(exp)));
            num = extrac;
            exp = exp +1;
        }
        exp = 0;
        BigInteger numB2 = BigInteger.ZERO , convInv = null;
        while (!numB10.equals(BigInteger.ZERO)) {            
            convInv = numB10.mod(B2);
            numB2 = numB2.add(convInv.multiply(bigInteger10.pow(exp)));
            exp = exp +1;
            numB10 = numB10.divide(B2);
        }
        System.out.println("El número: "+N+ " en base B1: "+B1);
        System.out.println("Es equivalente en base B2: "+B2);
        System.out.println(numB2);
    }
    
}
