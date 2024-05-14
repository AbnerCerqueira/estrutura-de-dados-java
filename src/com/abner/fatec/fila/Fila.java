package com.abner.fatec.fila;

public class Fila {
    private int[] dados;
    private int fim;

    public Fila(int capMax) {
        dados = new int[capMax];
        fim = -1;
    }

    public boolean cheia() {
        return fim == dados.length - 1;
    }

    public boolean vazia() {
        return fim == -1;
    }

    public void enfileirar(int e) throws Exception {
        if (cheia()) {
            throw new Exception("A fila está cheia!");
        }
        fim++;
        dados[fim] = e;
    }

    public int desenfileirar() throws Exception { // FIFO(First In First Out) o primeiro q entra é primeiro que sai.
        if (vazia()) {
            throw new Exception("A fila está vazia!");
        }
        int r = dados[0];
        for (int i = 0; i < fim; i++) {
            dados[i] = dados[i + 1];
        }
        fim--;
        return r;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= fim; i++) {
            sb.append(dados[i]).append(" ");
        }
        return sb.toString();
    }
}
