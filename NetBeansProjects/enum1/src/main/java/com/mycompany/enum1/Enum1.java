/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enum1;

/**
 *
 * @author Aluno
 */
public class Enum1 {

    public static void main(String[] args) {
    Funcionario funcionario1 = new Funcionario("345ide", "Ruan", 4500, Setor.RECURSOSHUMANOS, Sexo.MASCULINO, 22);
    
        System.out.println("\nDados do funcionario");
        System.out.println("Id: " + funcionario1.getId());
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salario: " + funcionario1.getSalario());
        System.out.println("Setor: " + funcionario1.getSetor());
        System.out.println("Sexo: " + funcionario1.getSexo());
        System.out.println("Idade: " + funcionario1.getIdade());
    }
}
