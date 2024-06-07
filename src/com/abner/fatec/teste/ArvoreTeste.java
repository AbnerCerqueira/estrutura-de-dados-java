package com.abner.fatec.teste;

import com.abner.fatec.arvoreBinaria.Arvore;

public class ArvoreTeste {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        arvore.adiciona(25);
        arvore.adiciona(25);
        arvore.adiciona(83);
        arvore.adiciona(16);
        arvore.adiciona(36);
        arvore.adiciona(9);
        arvore.adiciona(13);
        arvore.adiciona(18);
        arvore.adiciona(64);
        arvore.adiciona(21);

        // percursos
        arvore.profundidade();
        arvore.emOrdem();
        arvore.posOrdem();
    }
}
