package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Sorveteria {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha um produto:");
        System.out.println("1 - Casquinha\t| 2 - Sundae\t|3 - Milkshake");
        Integer escolha = leitor.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Casquinha custa R$2,00 reais");
                break;
            case 2:
                System.out.println("Sundae custa R$5,00 reais");
                break;
            case 3:
                System.out.println("Milkshake custa R$7,00 reais");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}
