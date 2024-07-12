package exercicios;
import java.util.Scanner;

public class ex004 {
    
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18 || idade > 65){

            System.out.println("Não é obrigado a se alistar");

        }
        else{

            System.out.println("É obrigado a se alistar!!!");

        }

    scanner.close();

    }

}
