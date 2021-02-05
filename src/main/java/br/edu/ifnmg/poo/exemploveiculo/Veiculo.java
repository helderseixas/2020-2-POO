/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.exemploveiculo;

/**
 *
 * @author helder
 */
public class Veiculo {
    private static int totalVeiculos = 0;
    
    //Atributos
    private String tipo;
    private String modelo;
    private String marca;
    private int ano;
    private double kilometragem;
    private String motorista;
    
    public Veiculo(String tipo, String modelo, String marca, int ano, double kilometragem){
        this(tipo, modelo, marca, ano, kilometragem, null);
    }
    
    public Veiculo(String tipo, String modelo, String marca, int ano){
        this(tipo, modelo, marca, ano, 0);
    }
    
    public Veiculo(String tipo, String modelo, String marca, int ano, double kilometragem, String motorista){
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;        
        if(kilometragem > 0){
            this.kilometragem = kilometragem;
        }else{
            this.kilometragem = 0;
        }
        this.motorista = motorista;
        
        totalVeiculos++;
    }
    
    //Métodos
    public void deslocar(double kilometragemDeslocamento){
        if(kilometragemDeslocamento > 0){
            this.kilometragem += kilometragemDeslocamento;
        }
    }
    
    public void deslocar(double kilometragemDeslocamento, String motorista){
        this.motorista = motorista;
        this.deslocar(kilometragemDeslocamento);
    }
    
    public static int getTotalVeiculos(){
        return totalVeiculos;
    }
    
    public String getTipo(){
        return this.tipo;
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
}
