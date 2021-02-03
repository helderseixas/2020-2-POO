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
    
    public Veiculo(String tipo, String modelo, String marca, int ano, double kilometragem){
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        if(kilometragem > 0){
            this.kilometragem = kilometragem;
        }else{
            this.kilometragem = 0;
        }
        
        totalVeiculos++;
    }
    
    //Métodos
    public void deslocar(double kilometragemDeslocamento){
        if(kilometragemDeslocamento > 0){
            this.kilometragem += kilometragemDeslocamento;
        }
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
}
