package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        String nome = "Marta";
        String sobrenome = "Silveira";

        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());

        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        System.out.println("Concatenação maiuscula: " + nomeCompleto.toUpperCase());
        System.out.println("Concatenação minuscula: " + nomeCompleto.toLowerCase());

    }
}
