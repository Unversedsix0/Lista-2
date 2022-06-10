
package appfibonacci;

import javax.swing.JOptionPane;


public class Principal {


    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Sequencia de Fibonacci", "Fibonacci", 3));
        fibo.setNum(num);
        
        JOptionPane.showMessageDialog(null,fibo.sequenciaFibo(),"Fibonacci",-1);
        System.exit(0);
    }
    
}
