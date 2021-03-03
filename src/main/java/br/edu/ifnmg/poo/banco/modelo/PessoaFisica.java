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
public class PessoaFisica extends Cliente{
    private double salario;
    
    public PessoaFisica(String nome, String senha, double salario){
        super(nome, senha);
        if(salario >= 0){
            this.salario = salario;        
        }else{
            this.salario = 0;
        }
    }

    public double getSalario() {
        return salario;
    }
    
}
