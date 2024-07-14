package exercicios;
import java.util.Scanner;

public class ex005 {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o operador que deseja: +, -, *, / : ");
    String operador = scanner.nextLine();

    System.out.println("Digite o primeiro número: ");
    int primeiroNumero = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    int segundoNumero = scanner.nextInt();

    switch(operador){

        case "+":

        System.out.println("Resultado: " + (primeiroNumero + segundoNumero));

        break;

        case "-":

        System.out.println("Resultado: " + (primeiroNumero - segundoNumero));

        break;

        case "*":

        System.out.println("Resultado: " + (primeiroNumero * segundoNumero));

        break;

        case "/":

        System.out.println("Resultado: " + (primeiroNumero / segundoNumero));

        break;

    }

    scanner.close();

    }
    
}
