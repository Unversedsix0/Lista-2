
package appequacao;

import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
        Equacao2Grau equacao = null;
         
        int a  = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de a", "Equacao 2 grau", 3));
        int b  = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de b", "Equacao 2 grau", 3));
        int c  = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor de c", "Equacao 2 grau", 3));
        
        equacao = new Equacao2Grau(a,b,c);
        
        JOptionPane.showMessageDialog(null, equacao.raizes(), "Equacao 2 grau", -1);
        
        System.exit(0);
    }
    
}
