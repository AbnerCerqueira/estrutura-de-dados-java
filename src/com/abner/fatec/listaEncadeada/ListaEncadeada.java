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

    public int removeInicio() throws Exception {
        if (vazia()) { // se tentar remover com a lista vazia o programa é encerrado
            throw new Exception("A lista está vazia");
        }
        int r = inicio.dado;
        inicio = inicio.prox;
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
