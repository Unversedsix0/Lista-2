
package appfinanceiro;

public class Aplicacao {
    //Atributos
    private float valorDepositado;
    private float taxaDeJuros;
    
    //Métodos de acesso

    public float getValorDepositado() {
        return valorDepositado;
    }

    public void setValorDepositado(float valorDepositado) {
        this.valorDepositado = valorDepositado;
    }

    public float getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(float taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    
    public float valorRendimento(){
        return valorDepositado*taxaDeJuros/100;
    }
    
    public float valorTotal(){
        return valorDepositado+valorRendimento();
    }
}
