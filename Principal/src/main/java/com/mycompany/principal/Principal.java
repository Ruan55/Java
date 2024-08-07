/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
    // Instanciando um objeto
    Funcionarios funcionario = new Funcionarios();
    
        funcionario.setNome("Ruan");
        funcionario.setIdade(21);
        funcionario.setSalario(3400);
        
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Salario: " + funcionario.getSalario());
         
    }
}
