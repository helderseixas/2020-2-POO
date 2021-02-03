/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo;

import br.edu.ifnmg.poo.exemploveiculo.Veiculo;
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
        //Declaracão de uma referência
        Veiculo uno;
        //Instaciacão de um objeto e atribuicão à uma referência
        uno = new Veiculo("Carro", "Uno Mile", "Fiat", 2010, 100000);                        
        //Acessar método
        uno.deslocar(100);
        imprimirVeiculo(uno);
        
        Veiculo ka;
        ka = new Veiculo("Carro", "Ka", "Ford", 2020, 0);                
        ka.deslocar(10);
        ka.deslocar(-5);
                
        imprimirVeiculo(ka);
        
        System.out.printf("\nTotal veículos: %d", Veiculo.getTotalVeiculos());
    }
    
    static void imprimirVeiculo(Veiculo veiculo){
        System.out.printf("\n\nTipo: %s", veiculo.getTipo());
        System.out.printf("\nModelo: %s", veiculo.getModelo());
        System.out.printf("\nMarca: %s", veiculo.getMarca());
        System.out.printf("\nAno: %d", veiculo.getAno());
        System.out.printf("\nKilometragem: %.2f", veiculo.getKilometragem());
    }    
}
