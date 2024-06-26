package com.abner.fatec.array;

public class Lista {
    private int[] dados;
    private int tamanho;

    public Lista(int capMax) {
        dados = new int[capMax];
        tamanho = 0;
    }

    public boolean vazia() {
        return tamanho == 0;
    }

    public boolean cheia() {
        return tamanho == dados.length;
    }

    public void adicionaFinal(int e) throws Exception {
        if (cheia()) {
            throw new Exception("A lista está cheia!"); // se a lista estiver cheia é disparado uma exceção que encerra o programa
        }
        // se o programa nao foi encerrado pela condição acima, então é executado as linhas abaixo
        dados[tamanho] = e;
        tamanho++;
    }

    public void adicionaInicio(int e) throws Exception {
        if (cheia()) {
            throw new Exception("A lista está cheia!");
        }
        for (int i = tamanho; i > 0; i--) { // loop que pega elementos da esquerda e joga pra direita
            dados[i] = dados[i - 1];
        }
        dados[0] = e; // adicionando no inicio
        tamanho++;
    }

    public int removeFinal() throws Exception {
        if (vazia()) {
            throw new Exception("A lista está vazia!");
        }
        int r = dados[tamanho - 1];
        tamanho--;
        return r;
    }

    public int removeInicio() throws Exception {
        if (vazia()) {
            throw new Exception("A lista está vazia!");
        }
        int r = dados[0];
        for (int i = 0; i < tamanho - 1; i++) { // vai percorrer a lista e sobrepor os elementos um indice pra tras
            dados[i] = dados[i + 1];
        }
        tamanho--;
        return r;
    }

    public int removeEscolhe(int e) throws Exception {
        if (vazia()) {
            throw new Exception("A lista está vazia!");
        }
        e--; // vai ser passado qual elemento quer, então diminui 1 pra pegar o indice certo
        int r = dados[e];
        for (int i = e; i < tamanho - 1; i++) {
            dados[i] = dados[i + 1];
        }
        tamanho--;
        return r;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            sb.append(dados[i]).append(" ");
        }
        return sb.toString();
    }
}
