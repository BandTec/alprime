package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Desconto {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do produto:");
        Double valorProduto = leitor.nextDouble();

        System.out.println("Digite o código de desconto:");
        System.out.println("\tcódigo\t|\tdesconto\n"
                + "\t1\t|\t5%\n"
                + "\t2\t|\t10%\n"
                + "\t3\t|\t20%\n"
                + "\t4\t|\t50%\n");

        Integer escolha = leitor.nextInt();
        Double valorDesconto = 0.0;
        
        switch (escolha) {
            case 1:
                valorDesconto = (valorProduto - (valorProduto * 0.05));
                break;
            case 2:
                valorDesconto = (valorProduto - (valorProduto * 0.1));
                break;
            case 3:
                valorDesconto = (valorProduto - (valorProduto * 0.2));
                break;
            case 4:
                valorDesconto = (valorProduto - (valorProduto * 0.5));
                break;
            default:
                System.out.println("Código inválido.");
                break;
        }

        System.out.println(String.format("Valor do produto: R$%.2f\tValor com desconto: R$%.2f", valorProduto, valorDesconto));
    }
}
