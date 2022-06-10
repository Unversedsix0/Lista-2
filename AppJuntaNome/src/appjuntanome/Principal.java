package appjuntanome;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {

    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa();
       
       String nome = JOptionPane.showInputDialog(null, "Digite seu nome", "App Junta Nome", 3);
       pessoa.getNome(nome);
    }
    
}
    


