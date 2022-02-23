/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_10;

/**
 *
 * @author Matias
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B =  new double[20];
        double aux = 0;
        
        for(int i = 0; i < 50; i++){
            A[i] = (float)Math.random() * 100;
        }
        for(int i = 0; i < 50; i++){
            System.out.print(String.format("%.2f", A[i]) + " ");
        }
        System.out.println("");
        
        for(int i = 0; i < 49; i++){
            for(int j = 0; j < 49; j++) {
                if(A[j] > A[j+1]) {
                    aux = A[j];
                    A[j] = A[j+1];
                    A[j+1] = aux;
                }
            }    
        }
        for(int i = 0; i < 19; i++){
            if(i < 9) {
                B[i] = A[i];
            } else {
                B[i] = 0.5;
            }
        }
        
        System.out.println(" ");
        for(int i = 0; i < 50; i++){
            System.out.print(String.format("%.2f", A[i]) + " ");
        }
        
        System.out.println(" ");
        System.out.println("");
        for(int i = 0; i < 19; i++){
            System.out.print(String.format("%.2f", B[i]) + " ");
        }
        System.out.println("");
    }
    
}
