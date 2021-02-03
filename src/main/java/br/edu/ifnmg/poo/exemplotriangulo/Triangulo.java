/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.exemplotriangulo;

/**
 *
 * @author helder
 */
public class Triangulo {
    double comprimentoLado1;
    double comprimentoLado2;
    double comprimentoLado3;
         
    double maiorLado(){
        if(comprimentoLado1 > comprimentoLado2 && 
                comprimentoLado1 > comprimentoLado3){
            return comprimentoLado1;
        }else if(comprimentoLado2 > comprimentoLado1 && 
                comprimentoLado2 > comprimentoLado3){
            return comprimentoLado2;
        }else{
            return comprimentoLado3;
        }
    }    
    
    double menorLado(){
        if(comprimentoLado1 < comprimentoLado2 && 
                comprimentoLado1 < comprimentoLado2){
            return comprimentoLado1;
        }else if(comprimentoLado2 < comprimentoLado1 &&
                comprimentoLado2 < comprimentoLado3){
            return comprimentoLado2;
        }else{
            return comprimentoLado3;
        }
    }
    
    String tipoDoTriangulo(){
        if(comprimentoLado1 == comprimentoLado2 && 
                comprimentoLado1 == comprimentoLado3) {
            return "Equilátero";
        }else if(comprimentoLado1 == comprimentoLado2 ||
                comprimentoLado1 ==  comprimentoLado3 ||
                comprimentoLado2 == comprimentoLado3){
            return "Isósceles";
        }else{
            return "Escleno";
        }
    }
}
