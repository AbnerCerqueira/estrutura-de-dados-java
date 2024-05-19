package com.abner.fatec.listaEncadeada;

public class ListaEncadeada {
    private No inicio = null;

    public boolean vazia() {
        return inicio == null;
    }

    public void adicionaInicio(int e) {
        No novoNo = new No(e);
        novoNo.prox = inicio;
        inicio = novoNo;
    }

    public void adicionaFinal(int e) {
        if (vazia()) {
            inicio = new No(e);
            return;
        }
        No aux = inicio;
        while (aux.prox != null) { // percorrer lista até o final
            aux = aux.prox;
        }
        aux.prox = new No(e);
    }

    public int removeInicio() throws Exception {
        if (vazia()) { // se tentar remover com a lista vazia o programa é encerrado
            throw new Exception("A lista está vazia");
        }
        int r = inicio.dado;
        inicio = inicio.prox;
        return r;
    }

    public int removeFinal() throws Exception {
        if (vazia()) {
            throw new Exception("A lista está vazia!");
        }
        if (inicio.prox == null) { // caso tenha somente 1 nó na lista
            int r = inicio.dado;
            inicio = null;
            return r;
        }
        No aux = inicio;
        while (aux.prox.prox != null) { // percorrer até o penultimo nó
            aux = aux.prox;
        }
        int r = aux.prox.dado; // pegar o ultimo (o aux parou no penultimo)
        aux.prox = null; // garbage collector vai eliminar da memoria o nó que está no final
        return r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        No aux = inicio;

        while (aux != null) {
            sb.append(aux.dado).append(" ");
            aux = aux.prox;
        }
        return sb.toString();
    }
}
