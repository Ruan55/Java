/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heranca;

/**
 *
 * @author Aluno
 */
public class Cliente extends Pessoa{
    private String dataDeCompra;
    private String formaDePagamento;
    private String endereco;

    public Cliente(String dataDeCompra, String formaDePagamento, String nome, int idade, String endereco, String telefone) {
        super(nome, idade, endereco, telefone);
        this.dataDeCompra = dataDeCompra;
        this.formaDePagamento = formaDePagamento;
    }

    public String getDataDeCompra() {
        return dataDeCompra;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    
}
