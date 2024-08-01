package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    Scanner scanner = new Scanner(System.in);    

        System.out.println("Digite seu nome de usuario: ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Digite a sua senha: ");
        int senha = scanner.nextInt();

        boolean resultadoNome = nomeUsuario.equals("Ruan");
        boolean resultadoSenha = (senha == 123);

        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    
    scanner.close();
    }
}