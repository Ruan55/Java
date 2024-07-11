package exercicios;
import java.util.Scanner;

public class ex003 {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    int primeiroNumero = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    int segundoNumero = scanner.nextInt();

    int soma = primeiroNumero + segundoNumero;

    int produto = primeiroNumero * segundoNumero;

    float media = soma / 2;

    System.out.println("Media: " + media);
    System.out.println("Soma: " + soma);
    System.out.println("Produto: " + produto);

    if(primeiroNumero > segundoNumero){

        System.out.println("Primeiro número é maior");

    }
    else if(primeiroNumero < segundoNumero){

        System.out.println("Primeiro número é menor");

    }

    if(segundoNumero > primeiroNumero){

        System.out.println("Segundo número é maior");

    }
    else if (segundoNumero < primeiroNumero){

        System.out.println("Segundo número é menor");

    }
    else{

        System.out.println("Os dois número são iguais");

    }

    scanner.close();

    }
    
}
