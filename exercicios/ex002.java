package exercicios;
import java.util.Scanner;

public class ex002 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota: ");
        int nota3 = scanner.nextInt();

        int soma = nota1 + nota2 + nota3;

        float media = soma / 3;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Terceira nota: " + nota3);
        System.out.println("Media: " + media);

        if (media >= 7.0){

            System.out.println("Aprovado!");

        }
        else if(media >= 5 && media <= 6.9){

            System.out.println("Recuperação!");

        }
        else{

            System.out.println("Reprovado!");

        }

        scanner.close();

    }

}
