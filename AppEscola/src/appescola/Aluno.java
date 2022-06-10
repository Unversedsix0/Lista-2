package appescola;

public class Aluno {

    private String nome;
    private String ra;
    private float nota1;
    private float nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float media() {
        return (nota1 + nota2) / 2;
    }

    public String situacao() {
        float media = media();
        if (media >= 6) {
            return "APROVADO!!!";
        } else if (media < 4) {
            return "REPROVADO. F";
        } else {
            return "EXAME";
        }
    }

    public String boletim() {
        String dados = "Boletim Academico de "+nome+" - RA:" + ra + "\nNota do 1º bimestre:" + nota1 + "\nNota do 2º bimestre:" + nota2 + "\nMedia Final:" + media() + "\nSituação:" + situacao();
        return dados;

    }
}
