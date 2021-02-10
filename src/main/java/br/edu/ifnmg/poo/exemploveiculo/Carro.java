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
public class Carro extends Veiculo{
    
    private int capacidadeMaximaPassageiros;
    private double volumeMaximoPortaMalas;
    private double volumeMaximoCarroceria;
    
    public Carro(String modelo, 
            String marca, 
            int ano, 
            double kilometragem, 
            String motorista,
            int capacidadeMaximaPassageiros,
            int volumeMaximoPortaMalas,
            int volumeMaximoCarroceria){
        super(modelo, marca, ano, kilometragem, motorista);       
        
        this.capacidadeMaximaPassageiros = capacidadeMaximaPassageiros;
        this.volumeMaximoCarroceria = volumeMaximoCarroceria;
        this.volumeMaximoPortaMalas = volumeMaximoPortaMalas;                
    }

    public int getCapacidadeMaximaPassageiros() {
        return capacidadeMaximaPassageiros;
    }

    public double getVolumeMaximoPortaMalas() {
        return volumeMaximoPortaMalas;
    }

    public double getVolumeMaximoCarroceria() {
        return volumeMaximoCarroceria;
    }
    
    
}
