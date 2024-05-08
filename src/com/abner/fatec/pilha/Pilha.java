package com.abner.fatec.pilha;

public class Pilha {
    private int[] dados;
    private int topo;

    public Pilha(int capMax) {
        dados = new int[capMax];
        topo = -1;
    }

    public boolean cheia() {
        return topo == dados.length - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void empilhar(int e) throws Exception {
        if (cheia()) {
            throw new Exception("A pilha está cheia!");
        }
        topo++;
        dados[topo] = e;
    }

    public int desempilhar() throws Exception{ // LIFO(Last in First Out) o ultimo sempre sai primeiro
        if (vazia()) {
            throw new Exception("A pilha está vazia!");
        }
        int r = dados[topo];
        topo--;
        return r;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = topo; i >= 0; i--) {
            s.append(dados[i]).append("\n");
        }
        return s.toString();
    }
}
