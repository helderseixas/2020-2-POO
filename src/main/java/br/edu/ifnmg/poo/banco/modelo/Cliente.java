/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.banco.modelo;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
