/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelse;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Ifelse {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        int a = 20;
        int b = 2;
        int maior;
        
        if(a > b){
            
            maior = a;
            
        }
        else{
            
            maior = b;
            
        }
        
        System.out.println("O maior número é: " + maior);
        
    scanner.close();
    }
}
