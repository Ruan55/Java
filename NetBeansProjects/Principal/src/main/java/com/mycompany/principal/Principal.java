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
    Funcionario funcionario1 = new Funcionario(2131, "Ruan", 22, 5780, Setor.VENDAS, Sexo.MASCULINO);
        
        System.out.println("\nDados funcionarios");
        System.out.println("Id: " + funcionario1.getId());
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("Salario: " + funcionario1.getSalario());
        System.out.println("Setor: " + funcionario1.getSetor().getTexto());
        System.out.println("Sexo: " + funcionario1.getSexo().getTexto());
        
    }
}
