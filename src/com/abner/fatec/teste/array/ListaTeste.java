package com.abner.fatec.teste.array;

import com.abner.fatec.array.Lista;

import java.util.Scanner;

public class ListaTeste {
    public static void main(String[] args) throws Exception {
        Lista l = new Lista(5);
        Scanner input = new Scanner(System.in);

        String menu = "1- Adicionar no final" +
                "\n2. Adicionar no inicio" +
                "\n3. Remover final" +
                "\n4. Remover inicio" +
                "\n5. Escolher a posição que quer remover" +
                "\n6. Exibir lista" +
                "\n7. Sair";
        int choice;
        do {
            System.out.println(menu);
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Digite o elemento: ");
                    l.adicionaFinal(input.nextInt());
                    break;
                case 2:
                    System.out.print("Digite o elemento: ");
                    l.adicionaInicio(input.nextInt());
                    break;
                case 3:
                    System.out.println("Item removido: " + l.removeFinal());
                    break;
                case 4:
                    System.out.println("Item removido: " + l.removeInicio());
                    break;
                case 5:
                    System.out.print("Digite a posição do item que quer remover: ");
                    int r = l.removeEscolhe(input.nextInt());
                    System.out.println("Item removido: " + r);
                    break;
                case 6:
                    System.out.println(l);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (choice != 7);
    }
}
