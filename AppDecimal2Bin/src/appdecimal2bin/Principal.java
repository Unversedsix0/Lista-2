
package appdecimal2bin;

import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
        Binario num = new Binario();
        
        int nume = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero(Decimal)", "Bin2Dec", 3));
        num.setNumero(nume);
        
        JOptionPane.showMessageDialog(null,num.dec2bin(),"Bin2Dec",-1);
        System.exit(0);
    }
    
}
