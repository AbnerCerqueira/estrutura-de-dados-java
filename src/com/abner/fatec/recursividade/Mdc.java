package com.abner.fatec.recursividade;

public class Mdc extends Operacoes {
    private int n, n2;

    public Mdc(int n, int n2) {
        this.n = n;
        this.n2 = n2;
    }
    /*  o resto da divisao sempre vai ser menor que o divisor
        por isso a logica da chamada reursiva fica do jeito que ficou
    */
    public int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }

    @Override
    public String toString() {
        return "MDC " + n + " " + n2 + ": " + mdc(n, n2);
    }
}
