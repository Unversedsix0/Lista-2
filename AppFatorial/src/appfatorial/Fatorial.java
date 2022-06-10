/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfatorial;

public class Fatorial {

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public long fatorialFor() {
        if (num < 0) {
            return 0;//erro,valor negativo
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            long fat = 1;
            for (int i = num; i >= 1; i--) {
                fat *= i;
            }
            return fat;
        }
    }

    public long fatorialWhile() {
        if (num < 0) {
            return 0;//erro,valor negativo
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            long fat = 1;
            int cont = num;
            while (cont >= 1) {
                fat *= cont;
                cont--;
            }
            return fat;
        }

    }

    public long fatorialDoWhile() {
        if (num < 0) {
            return 0;//erro,valor negativo
        } else if (num == 0 || num == 1) {
            return 1;
        } else {
            long fat = 1;
            int cont = num;
            do {
                fat *= cont;
                cont--;
            } while (cont >= 1);
            return fat;
        }

    }
}