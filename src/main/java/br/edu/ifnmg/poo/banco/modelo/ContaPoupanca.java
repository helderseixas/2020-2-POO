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
public class ContaPoupanca extends Conta{
    private int diaAniversario;

    public ContaPoupanca(String numero, Cliente cliente, double saldo) {
        super(numero, cliente, saldo);
    }
    
}
