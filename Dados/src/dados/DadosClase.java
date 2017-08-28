/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DadosClase {

    public static void main(String[] args) {

        int i;
        int[] vdados = new int[11];
        final int veces = 1000000;

        SecureRandom r;
        try {
            r = SecureRandom.getInstance("SHA1PRNG");
            for (i = 0; i < veces; i++) {
                /*lanzando los dos dados, se incrementa la posicion en 1*/
                ++vdados[r.nextInt(6) + r.nextInt(6)];
            }
           int fmax= vdados[0];
            int rmax=2;
            System.out.printf("%s%12s%n", "Dado", "Frecuencia");
            for(i=0; i<vdados.length; i++){
                System.out.printf("%3d%12d%n", i+2, vdados[i]);
                
                if(vdados[i]>fmax){
                fmax= vdados[i];
                rmax= i+2;
                
                }
            
            }
            
            System.out.println("\n El numero que mas cae es: " + rmax + "con una frecuencia de:" + fmax);
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("Error" + DadosClase.class.getName() + "\n" + ex.getMessage());

        }

    }
}
