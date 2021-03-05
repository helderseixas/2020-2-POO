/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.banco.modelo;

/**
 *
 * @author helder
 */
public abstract class Cliente {
    private String nome;
    private String senha;
    
    public Cliente(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    
    public boolean verificarSenha(String senha){
        return this.senha.equals(senha);
    }
    
    
}
