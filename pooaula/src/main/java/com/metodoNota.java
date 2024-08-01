package com;

public class metodoNota {

    public static void main(String[] args){

        calculoMedia(10, 0);
        verificacaoNota(10);

    }

    static double calculoMedia(int nota1, int nota2){

        int soma = nota1 + nota2;

        double media = soma / 2;

        return media;
        
    }

    static void verificacaoNota(int nota){

        if(nota >= 7){

            System.out.println("Aprovado!");

        }
        else if(nota >= 5 && nota <= 6.9){

            System.out.println("Verificação suplementar");

        }
        else{

            System.out.println("Reprovado!");

        }

    }
    
}
