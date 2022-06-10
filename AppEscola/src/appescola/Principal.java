package appescola;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Aluno Aluno = new Aluno();
         
     
        String nome = JOptionPane.showInputDialog(null, "Nome do Aluno", "APP Escola", 3);
        String ra = JOptionPane.showInputDialog(null, "RA do aluno", "APP Escola", 3);
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota do 1ºBimestre", "APP Escola", 3));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a nota do 2ºBimestre", "APP Escola", 3));
        
        Aluno.setNome(nome);
        Aluno.setRa(ra);
        Aluno.setNota1(nota1);
        Aluno.setNota2(nota2);
        
        JOptionPane.showMessageDialog(null,Aluno.boletim(),"APP Escola",-1);

    }

}
