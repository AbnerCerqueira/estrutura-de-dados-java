package com.abner.fatec.teste;

import com.abner.fatec.fila.Fila;

import java.util.Random;

public class FilaTeste {
    public static void main(String[] args) throws Exception {
        Fila f = new Fila(5);
        Random gen = new Random();

        for (int i = 0; i < 5; i++) { // enfileirar até a capacidade maxima
            f.enfileirar(gen.nextInt(19) + 1);
        }
        System.out.println(f);

        for (int i = 0; i < 3; i++) { // desenfileirar e mostrar o que foi removido
            System.out.println("First In First Out: " + f.desenfileirar());
        }
        System.out.println(f);
    }
}
