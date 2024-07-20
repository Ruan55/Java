package exercicios;
import java.util.Scanner;

public class ex006 {
    
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);  
    
        int i;

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        for(i = 1; i <= 10; i++){

            System.out.println(numero + " x "+ i + " = " + numero * i);

        }
       
    scanner.close();
    
    }

}
