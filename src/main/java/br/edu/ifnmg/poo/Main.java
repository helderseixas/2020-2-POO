/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo;

import br.edu.ifnmg.poo.exemploveiculo.Carro;
import br.edu.ifnmg.poo.exemploveiculo.Moto;
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
        Carro uno;
        //Instaciacão de um objeto e atribuicão à uma referência
        uno = new Carro("Uno Mile", "Fiat", 2010, 100000, "João", 4, 200, 0);        
        //Acessar método        
        uno.deslocar(100, "José");
        //veiculos[0] = uno;    
        veiculos.add(uno);
        
        
        Veiculo ka;
        ka = new Carro("Ka", "Ford", 2020, 0, "Maria", 4, 190, 0);         
        ka.deslocar(10);
        ka.deslocar(-5);
        //veiculos[1] = ka;  
        veiculos.add(ka);
        
        Veiculo gol;
        gol = new Veiculo("Gol", "VW", 2021);
        //veiculos[2] = gol;
        veiculos.add(gol);
        
        Moto bros;
        bros = new Moto("Bros", "Honda", 2020, 50000, "Manoel", false, false);
        bros.deslocar(100);
        veiculos.add(bros);
        
        System.out.printf("\nTotal veículos: %d", Veiculo.getTotalVeiculos());
        
        imprimirVeiculo(veiculos);
    }
    
    static void imprimirVeiculo(Veiculo veiculo){        
        System.out.printf("\n\nModelo: %s", veiculo.getModelo());
        System.out.printf("\nMarca: %s", veiculo.getMarca());
        System.out.printf("\nAno: %d", veiculo.getAno());
        System.out.printf("\nKilometragem: %.2f", veiculo.getKilometragem());
        System.out.printf("\nMotorista: %s", veiculo.getMotorista());
        
        if(veiculo instanceof Carro){
            System.out.printf("\nTipo: carro");
            Carro carro = (Carro) veiculo;
            System.out.printf("\nCapacidade máxima de passageiros: %d", 
                    carro.getCapacidadeMaximaPassageiros());
            System.out.printf("\nVolume máximo porta malas: %.2f", 
                    carro.getVolumeMaximoPortaMalas());
            System.out.printf("\nVolume máximo carroceria: %.2f", 
                    carro.getVolumeMaximoCarroceria());
        }else if(veiculo instanceof Moto){
            System.out.printf("\n\nTipo: moto");
            Moto moto =  (Moto) veiculo;
            if(moto.isPossuiBau()){
                System.out.printf("\nPossui baú");
            }else{
                System.out.printf("\nNão possui baú");
            }
            if(moto.isPossuiEngateCarreta()){
                System.out.printf("\nPossui engate para carreta");
            }else{
                System.out.printf("\nNão possui engate para carreta");
            }
        }
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
