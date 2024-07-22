package exercicios;
import java.util.Scanner;

public class ex007 {

    public static void main(String[] args){
    Scanner scanner =  new Scanner(System.in);

    int i;

    for(i = 100; i <= 121; i++){

        if(i % 2 == 0){

            System.out.println("Número pares: " + i);

        }

    }

    scanner.close();

    }
    
}
