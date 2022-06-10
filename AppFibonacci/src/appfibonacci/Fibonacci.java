package appfibonacci;

/**
 *
 * @author aluno
 */
public class Fibonacci {

    private int num = 20;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String sequenciaFibo() {
        double numProximo = 0;
        double numAtual = 0;
        double numAnterior = 0;
        String resultado = "";
        for (int i = 0; i <= num; i++) {

            if (i == 1) {
                numAtual++;
            } else if (i > 1) {
                numProximo = numAtual + numAnterior;
            }
            numAnterior = numAtual;
            numAtual = numProximo;
            if (i > 0) {
                resultado += numAtual+"|";
            }

        }

        return resultado;
    }

}
