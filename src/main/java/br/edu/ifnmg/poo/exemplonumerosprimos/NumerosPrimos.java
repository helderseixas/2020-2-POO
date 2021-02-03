/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.exemplonumerosprimos;

import java.util.Scanner;

/**
 *
 * @author helder
 */
public class NumerosPrimos {
    
    public static void main(String parametro[]){
        Scanner leitorTeclado = new Scanner(System.in);
        
        System.out.print("Quantos números primos deseja visualizar? ");
        String nLidoTeclado =  leitorTeclado.nextLine();
        int n = Integer.parseInt(nLidoTeclado);
        
        int numeroEmVerificacao = 2;
        int numerosPrimosEncotrados = 0;
        
        System.out.printf("%d primeiros números primos: ", n);
        
        do{
            int i;
            for(i = 2; i <= numeroEmVerificacao - 1; i++){
                if(numeroEmVerificacao % i == 0){
                    break;
                }
            }
            if(i == numeroEmVerificacao){
                numerosPrimosEncotrados++;
                System.out.println(numeroEmVerificacao);
            }
            numeroEmVerificacao++;
        }while(numerosPrimosEncotrados < n);        
    }
    
}
