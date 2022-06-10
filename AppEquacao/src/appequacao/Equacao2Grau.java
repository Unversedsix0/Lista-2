package appequacao;

import java.lang.Math;

public class Equacao2Grau {
    private int a;
    private int b;
    private int c;

    public Equacao2Grau(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
   
    public float calculaDelta(){
        float delta = (float) Math.pow(b,2) - (4 * a * c);
        return delta;
    }
    
    public String raizes(){
        if(calculaDelta()<0){
            return "Delta negativo";
        }else{
             double x1 =  (-b + Math.sqrt(calculaDelta()))/ (2*a) ;
             double x2 =  (-b - Math.sqrt(calculaDelta()))/(2*a)  ;
             
             String resultado = "X1: " + x1 + "\nX2: "+x2;
             return resultado;
        }
        
    }
}
