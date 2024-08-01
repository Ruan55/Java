/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        
        double valorPrestacao = valorCompra / 5;
        
        System.out.println("Loja Mamão com Açúcar");
        System.out.println("Valor da prestação: " + valorPrestacao);
    
    scanner.close();
    }
}
