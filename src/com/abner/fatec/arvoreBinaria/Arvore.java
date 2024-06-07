package com.abner.fatec.arvoreBinaria;

public class Arvore {
    public NoArvore raiz = null;


    public void adiciona(int e) {
        raiz = adicionaRecursivo(raiz, e);
//        adicionaPaiFilho(e);
    }

    public NoArvore adicionaRecursivo(NoArvore raiz, int e) { // usar recursividade para percorrer a arvore
        if (raiz == null) { // caso base
            return new NoArvore(e);
        }
        /* cada chamada recurvisa vai fazer irmos para o próximo nível da arvore
        até chegar numa posição vazia
         */
        if (e < raiz.elemento) {
            raiz.esquerda = adicionaRecursivo(raiz.esquerda, e);
        } else if (e > raiz.elemento) {
            raiz.direita = adicionaRecursivo(raiz.direita, e);
        } else {
            raiz.ocorrencias += 1;
        }
        return raiz; // retornar o resultado das chamadas que estão na pilha de instruções
    }

    public void adicionaPaiFilho(int e) { // percorrer com um no na frente e outro atras para poder adicionar dps do ultimo
        NoArvore novo = new NoArvore(e);
        if (raiz == null) {
            raiz = novo;
            return;
        }

        NoArvore atual = raiz, pai = raiz;
        while (atual != null && atual.elemento != e) {
            pai = atual; // acompanhar o nó que está indo na frente
            if (e < atual.elemento) {
                atual = atual.esquerda;
            } else {
                atual = atual.direita;
            }
        }

        if (e == pai.elemento) {
            pai.ocorrencias += 1;
        } else if (e < pai.elemento) {
            pai.esquerda = novo;
        } else {
            pai.direita = novo;
        }
    }

    // sobrecarga de metodos
    public void profundidade() {
        profundidade(raiz);
        System.out.println();
    }

    public void emOrdem() {
        emOrdem(raiz);
        System.out.println();
    }

    public void posOrdem() {
        posOrdem(raiz);
        System.out.println();
    }
    //
    // fazer as buscas
    public void profundidade(NoArvore e) {
        if (e != null) {
            System.out.printf("%d(%d) ", e.elemento, e.ocorrencias);
            profundidade(e.esquerda);
            profundidade(e.direita);
        }
    }

    public void emOrdem(NoArvore e) {
        if (e != null) {
            emOrdem(e.esquerda);
            System.out.printf("%d(%d) ", e.elemento, e.ocorrencias);
            emOrdem(e.direita);
        }
    }

    public void posOrdem(NoArvore e) {
        if (e != null) {
            posOrdem(e.esquerda);
            posOrdem(e.direita);
            System.out.printf("%d(%d) ", e.elemento, e.ocorrencias);
        }
    }
    //
}
