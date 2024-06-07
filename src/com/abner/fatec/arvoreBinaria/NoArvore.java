package com.abner.fatec.arvoreBinaria;

public class NoArvore {
    public int elemento, ocorrencias = 1;
    public NoArvore esquerda, direita;

    public NoArvore(int elemento) {
        this.elemento = elemento;
        esquerda = null;
        direita = null;
    }
}
