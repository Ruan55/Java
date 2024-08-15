/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

/**
 *
 * @author Aluno
 */
public class Heranca {

    public static void main(String[] args) {
    Cliente cliente1 = new Cliente("04/06/2024", "A vista", "Ruan", 22, "Avenida Paulista", "3333-4444");
    Funcionario funcionario1 = new Funcionario("12321", "Analista", 3400, "Paulo", 33, "Xique Xique", "5555-3333");
       
        System.out.println("\nDados do cliente");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());
        
        System.out.println("\nDados do funcionario");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Endereço: " + funcionario1.getEndereco());
        System.out.println("Telefone: " + funcionario1.getTelefone());
        
    }
}
