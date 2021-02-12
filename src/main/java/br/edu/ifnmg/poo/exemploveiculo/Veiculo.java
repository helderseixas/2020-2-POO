/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.exemploveiculo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author helder
 */
public abstract class Veiculo {
    private static int totalVeiculos = 0;
    
    //Atributos    
    private String modelo;
    private String marca;
    private int ano;
    private double kilometragem;
    private String motorista;
    private ArrayList<Deslocamento> historicoDeslocamentos;
    
    public Veiculo(String modelo, String marca, int ano, double kilometragem){
        this(modelo, marca, ano, kilometragem, null);
    }
    
    public Veiculo(String modelo, String marca, int ano){
        this(modelo, marca, ano, 0);
    }
    
    public Veiculo(String modelo, String marca, int ano, double kilometragem, String motorista){        
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;        
        if(kilometragem > 0){
            this.kilometragem = kilometragem;
        }else{
            this.kilometragem = 0;
        }
        this.motorista = motorista;
        
        this.historicoDeslocamentos = new ArrayList<>();
        
        totalVeiculos++;
    }
    
    //Métodos
    public void deslocar(double kilometragemDeslocamento, 
            int quantidadePassageiros, 
            double volumeCarga){
        if(kilometragemDeslocamento > 0){
            this.kilometragem += kilometragemDeslocamento;
            
            Date dataDeslocamento = new Date();
        
            Deslocamento deslocamento = new Deslocamento(dataDeslocamento, 
                this.motorista, 
                kilometragemDeslocamento, 
                quantidadePassageiros, 
                volumeCarga);
            
            this.historicoDeslocamentos.add(deslocamento);
        }                
    }
    
    public void deslocar(double kilometragemDeslocamento, 
            String motorista, 
            int quantidadePassageiros, 
            double volumeCarga){
        this.motorista = motorista;
        this.deslocar(kilometragemDeslocamento,
                quantidadePassageiros,
                volumeCarga);
    }
    
    public static int getTotalVeiculos(){
        return totalVeiculos;
    }    

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getKilometragem() {
        return kilometragem;
    }    
    
    public void setMotorista(String motorista){
        this.motorista = motorista;
    }
    
    public String getMotorista(){
        return this.motorista;
    }
    
    public ArrayList<Deslocamento> getHistoricoDeslocamentos(){
        return this.historicoDeslocamentos;
    }
}
