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
public class Moto extends Veiculo {
    
    private boolean possuiBau;
    private boolean possuiEngateCarreta;
    
    public Moto(String modelo, 
            String marca, 
            int ano, 
            double kilometragem, 
            String motorista,
            boolean possuiBau,
            boolean possuiEngateCarreta){
        super(modelo, marca, ano, kilometragem, motorista);
        
        this.possuiBau = possuiBau;
        this.possuiEngateCarreta = possuiEngateCarreta;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public boolean isPossuiEngateCarreta() {
        return possuiEngateCarreta;
    }
    
    
    
}
