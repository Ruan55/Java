package com;

import java.util.Scanner;

public class nota {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media < 7){

            System.out.println("Reprovado!");

        }

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Media: " + media);
    
    scanner.close();
    }
    
}
