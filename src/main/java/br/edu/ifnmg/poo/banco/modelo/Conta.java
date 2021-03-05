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
public abstract class Conta {
    private String numero;
    private double saldo;
    private Cliente cliente;
    
    public Conta(String numero, Cliente cliente, double saldo){
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
    
}
