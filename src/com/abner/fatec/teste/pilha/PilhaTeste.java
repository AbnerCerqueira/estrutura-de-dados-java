package com.abner.fatec.teste.pilha;

import com.abner.fatec.pilha.Pilha;

import java.util.Random;

public class PilhaTeste {
    public static void main(String[] args) throws Exception { // pegar exceptions
        Pilha p = new Pilha(5);
        Random gen = new Random();

        for (int i = 0; i < 5; i++) { // empilhar até a capacidade maxima
            p.empilhar(gen.nextInt(19) + 1);
        }
        System.out.println(p); // exibir em string

        for (int i = 0; i < 3; i++) { // desempilhar e mostrar qual elemento foi desempilhado
            System.out.println("Last In First Out: " + p.desempilhar());
        }
        System.out.println(p);
    }
}
