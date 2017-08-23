/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.util.Random;
/**
 *
 * @author ESTUDIANTE
 */
public class JavaApplication10 {
    public static void main(String[] args) {
       
        int dado1, dado2, resultado;
        
        int [] frecuencia={0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for ( int i=1; i<=1000000; i++){
            dado1 =(int) (6*Math.random() +1); 
            dado2 =(int) (6*Math.random() +1);
            resultado= dado1+dado2;
            frecuencia[resultado-2] ++; 
           
        }
        System.out.println("frecuencia de resultados:");
        for (int i=0; i<=10; i++) {
            System.out.print("frecuencia de " + (i+2));
            System.out.println(":" + frecuencia[i]);
            
        }
        
        
    }
    
}
