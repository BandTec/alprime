package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class IndiceMassaCorporal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Selecione o sexo:");
        System.out.println("1 - Feminino \t 2 - Masculino");
        Integer escolha = leitor.nextInt();

        System.out.println("Digite sua altura:");
        Double altura = leitor.nextDouble();

        System.out.println("Digite sua peso:");
        Double peso = leitor.nextDouble();

        peso = peso / (altura * altura);
        String avaliacao;

        switch (escolha) {
            case 1:
                if (peso < 19.10) {
                    avaliacao = "Abaixo do peso.";
                } else if (peso >= 19.10 && peso <= 25.80) {
                    avaliacao = "no peso normal.";
                } else if (peso > 25.80 && peso <= 27.30) {
                    avaliacao = "marginalmente acima do peso.";
                } else if (peso > 27.30 && peso <= 32.30) {
                    avaliacao = "acima do peso ideal";
                } else {
                    avaliacao = "Obeso";
                }
                break;
            case 2:
                if (peso < 20.70) {
                    avaliacao = "Abaixo do peso.";
                } else if (peso >= 20.70 && peso <= 26.40) {
                    avaliacao = "no peso normal.";
                } else if (peso > 26.40 && peso <= 27.80) {
                    avaliacao = "marginalmente acima do peso.";
                } else if (peso > 27.80 && peso <= 31.10) {
                    avaliacao = "acima do peso ideal";
                } else {
                    avaliacao = "Obeso";
                }
                break;
            default:
                avaliacao = "Escolha inválida, reinicie o programa.";
                break;
        }

        System.out.println(avaliacao);
    }
}
