
package appdecimal2bin;

import java.util.Arrays;


public class Binario {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
public String dec2bin(){
   int[] bin=null;
   int i=0;
   int aux = numero;
   while(aux > 0){
       bin[i] = aux % 2+bin[0];
       aux = aux/2;
       i++;
       
   }
   return Arrays.toString(bin);
}
    
    
    
    
}
