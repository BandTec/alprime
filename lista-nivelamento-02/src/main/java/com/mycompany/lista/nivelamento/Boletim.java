package com.mycompany.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Boletim {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a 1º nota:");
        Double notaTototal = leitor.nextDouble();

        System.out.println("Digite a 2º nota:");
        notaTototal += leitor.nextDouble();

        System.out.println("Digite a 3º nota:");
        notaTototal += leitor.nextDouble();

        Double media = notaTototal / 3;
        
        System.out.println(String.format("\nSua média é: %.2f \n", media));
        
        if (media >= 5 && media < 7) {
            System.out.println("têm direito de fazer uma prova de recuperação.");
        }else if(media >= 7){
            System.out.println("Passou direto!");
        }else{
            System.out.println("Reprovou direto!");
        }
    }
}
