/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.exemploveiculo;

import java.util.Date;

/**
 *
 * @author helder
 */
public class Deslocamento {
    private Date dataDeslocamento;
    private String motorista;
    private double kilometragem;
    private int quantidadePassageiros;
    private double volumeCarga;

    public Deslocamento(Date dataDeslocamento, String motorista, double kilometragem, int quantidadePassageiros, double volumeCarga) {
        this.dataDeslocamento = dataDeslocamento;
        this.motorista = motorista;
        this.kilometragem = kilometragem;
        this.quantidadePassageiros = quantidadePassageiros;
        this.volumeCarga = volumeCarga;
    }
    
    @Override
    public String toString(){
        StringBuilder stringDeslocamento = new StringBuilder();
        stringDeslocamento.append("Data: ").append(dataDeslocamento.toString());
        stringDeslocamento.append(" Motorista: ").append(motorista);
        stringDeslocamento.append(" Kilometragem: ").append(kilometragem);
        stringDeslocamento.append(" Qauntidade de passageiros: ").append(quantidadePassageiros);
        stringDeslocamento.append(" Volume da carga: ").append(volumeCarga);
        return stringDeslocamento.toString();
    }
    
    
}
