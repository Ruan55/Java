/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.computador;

/**
 *
 * @author Aluno
 */
public class DispositivoDeArmazenamento extends Produto{
    
    private String tipoDeConexao;

    public DispositivoDeArmazenamento(String tipoDeConexao, String marca, String modelo, String frequencia) {
        super(marca, modelo, frequencia);
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }
    
    
}
