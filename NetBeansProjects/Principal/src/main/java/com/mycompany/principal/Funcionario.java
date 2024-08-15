/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    
    private int id;
    private String nome;
    private int idade;
    private double salario;
    Setor setor;
    Sexo sexo;

    public Funcionario(int id, String nome, int idade, double salario, Setor setor, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public Sexo getSexo() {
        return sexo;
    }          
    
}
