package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class CalculadoraPizza {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Scanner leitorS = new Scanner(System.in);

        System.out.println("Digite o valor da pizza:");
        Double valorTotal = leitor.nextDouble();

        System.out.println("Digite o sabor:");
        String sabor = leitorS.nextLine();

        System.out.println("Digite o números de pessoas:");
        Integer numeroPessoas = leitor.nextInt();

        System.out.println("Quanto a galera está disposta a pagar?");
        Double valorPessoa = leitor.nextDouble();

        if ((valorTotal / numeroPessoas) <= valorPessoa) {
            System.out.println(String.format("A pizza de %s será dividida entre %d pessoas. R$VALOR p/ cada: %.2f", sabor, numeroPessoas, (valorTotal / numeroPessoas)));
        } else {
            System.out.println(String.format("Deu ruim no racha. A pizza deveria custar no máximo %.2f reais.", (numeroPessoas * valorPessoa)));
        }
    }
}
