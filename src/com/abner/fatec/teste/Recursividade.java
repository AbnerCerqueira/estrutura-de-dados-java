package com.abner.fatec.teste;

import com.abner.fatec.recursividade.*;

public class Recursividade {
    public static void main(String[] args) {
        Operacoes fatorial = new Fatorial(5);
        System.out.println(fatorial);


        Operacoes fibonacci = new Fibonacci(21);
        System.out.println(fibonacci);

        Operacoes mdc = new Mdc(372, 162);
        System.out.println(mdc);

    }
}
