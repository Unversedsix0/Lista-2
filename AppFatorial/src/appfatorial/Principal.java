
package appfatorial;

import javax.swing.JOptionPane;

public class Principal {


    public static void main(String[] args) {
        Fatorial Fatorial = new Fatorial();
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o n°","App Fatorial",3));
        Fatorial.setNum(numero);
        
        long resultado=Fatorial.fatorialDoWhile();
        
        if(resultado==0){
            JOptionPane.showMessageDialog(null,"Não há fatorial de valor negativo!", "App Fatorial",0);
        }else{
            JOptionPane.showMessageDialog(null,Fatorial.getNum()+"! ="+resultado,"App Fatorial",1);
        }
    }
    
}
