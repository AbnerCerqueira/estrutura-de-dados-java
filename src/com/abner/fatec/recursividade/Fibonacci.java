package com.abner.fatec.recursividade;

public class Fibonacci extends Operacoes{
    private int n;
    private final int[] memo; // memorizador, para deixar mais otimizado

    public Fibonacci(int n) {
        this.n = n;
        memo = new int[n + 1];
    }

    public int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] == 0) { // se o n nao tiver sido calculado eu guardo no memorizador
            memo[n] = fibo(n - 1) + fibo(n - 2);
        }
        return memo[n];
    }

    @Override
    public String toString() {
        return "Fibonacci " + n + ": " + fibo(n);
    }
}
