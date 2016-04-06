package aciertos;

import java.util.Scanner;

/**
 *
 * @author Daniel Muñoz Chacón
**/


/**
 * @version 2.0
 */

public class Aciertos {
    static int n = 0,cont = 0;
    static int x = (int) (500 *Math.random());
    
    
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            pideNumero(sc.nextInt());
            compara(n, x);

        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );

    }
    
    /**
     * Pide un número
     * @param numero Número a introducir
     */
    public static void pideNumero(int num){
    	n=num;
    }
    
    
    /**
     * Compara
     * @return comparacion Devuelve un boolean y, en caso de ser falso, además un String indicando si es mayor o menor 
     */
    public static boolean compara(int n1, int x1){    	
    	if (n1==x1) {
    		return true;	
    	} else{
    		cont++;
    		if (n1 > x1) {
    	           System.out.println("Te has pasado");
    	        } else if (n1 < x1){
    	        	System.out.println("Casi cerca...");
    	        }
    		return false;
    	}
    	
    	
    }
    
}

