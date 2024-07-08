package exercicios;
import java.util.Scanner;

public class ex001 {

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

        int soma = nota1 + nota2;

        float media = soma / 2;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Media: " + media);

        scanner.close();
    }
    
}
