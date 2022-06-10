package appimc;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "informe o peso do atleta", "APP IMC", 3));
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "informe a altura do atleta", "APP IMC", 3));

        Atleta Atleta = new Atleta();

        Atleta.setAltura(altura);
        Atleta.setPeso(peso);

        JOptionPane.showMessageDialog(null," O IMC é ="+Atleta.imc(),"APP IMC",-1);
      
    }
    
}
