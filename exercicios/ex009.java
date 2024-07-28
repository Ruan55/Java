package exercicios;
import java.util.Scanner;

public class ex009 {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        int i;
        int soma = 0;

        for(i = 1; i <= 5; i++){

            System.out.println("Digite o " + i +"º " + "número: ");
            int numero = scanner.nextInt();

            soma += numero;

        }

        System.out.println(soma);

    scanner.close();
    }
    
}