/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo;

import br.edu.ifnmg.poo.exemploveiculo.Veiculo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author helder
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        //Veiculo[] veiculos = new Veiculo[3];
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        
        //Declaracão de uma referência
        Veiculo uno;
        //Instaciacão de um objeto e atribuicão à uma referência
        uno = new Veiculo("Carro", "Uno Mile", "Fiat", 2010, 100000, "João");        
        //Acessar método        
        uno.deslocar(100, "José");
        //veiculos[0] = uno;    
        veiculos.add(uno);
        
        
        Veiculo ka;
        ka = new Veiculo("Carro", "Ka", "Ford", 2020); 
        ka.setMotorista("Maria");
        ka.deslocar(10);
        ka.deslocar(-5);
        //veiculos[1] = ka;  
        veiculos.add(ka);
        
        Veiculo gol;
        gol = new Veiculo("Carro", "Gol", "VW", 2021);
        //veiculos[2] = gol;
        veiculos.add(gol);
        
        System.out.printf("\nTotal veículos: %d", Veiculo.getTotalVeiculos());
        
        imprimirVeiculo(veiculos);
    }
    
    static void imprimirVeiculo(Veiculo veiculo){
        System.out.printf("\n\nTipo: %s", veiculo.getTipo());
        System.out.printf("\nModelo: %s", veiculo.getModelo());
        System.out.printf("\nMarca: %s", veiculo.getMarca());
        System.out.printf("\nAno: %d", veiculo.getAno());
        System.out.printf("\nKilometragem: %.2f", veiculo.getKilometragem());
        System.out.printf("\nMotorista: %s", veiculo.getMotorista());
    }    
    
    static void imprimirVeiculo(Veiculo veiculos[]){
//        for(Veiculo veiculo : veiculos){
//            imprimirVeiculo(veiculo);
//        }
        for(int i = 0; i < veiculos.length; i++){
            Veiculo veiculo = veiculos[i];
            imprimirVeiculo(veiculo);
        }
    }
    
    static void imprimirVeiculo(ArrayList<Veiculo> veiculos){
//        for(Veiculo veiculo : veiculos){
//            imprimirVeiculo(veiculo);
//        }
        for(int i = 0; i < veiculos.size(); i++){
            Veiculo veiculo = veiculos.get(i);
            imprimirVeiculo(veiculo);
        }
    }
}
