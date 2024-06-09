package com.abner.fatec.recursividade;

public class Fatorial extends Operacoes {
    private int n;

    public Fatorial(int n) {
        this.n = n;
    }

    public int fat(int n) {
        return (n == 0) ? 1 : n * fat(n - 1);
    }

    @Override
    public String toString() {
        return "Fatorial " + n + ": " + fat(n);
    }
}
