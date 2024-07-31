/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    // sout para auto completar o print
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();
        
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        
    scanner.close();
    }
}
