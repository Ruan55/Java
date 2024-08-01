package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        if(primeiroNumero < segundoNumero){

            System.out.println("Primeiro número é menor: " + primeiroNumero);

        }
        else{

            System.out.println("Segundo número é menor: " + segundoNumero);

        }

    scanner.close();    
    }

}