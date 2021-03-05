/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.banco.dados;

import br.edu.ifnmg.poo.banco.modelo.Conta;
import java.util.ArrayList;

/**
 *
 * @author helder
 */
public class ContaDAO {
    private static ArrayList<Conta> contas = new ArrayList<>();
    
    public static Conta getConta(String numero){
        for (Conta conta : contas) {
            if(conta.getNumero().equals(numero)){
                return conta;
            }
        }
        return null;
    }

    public static void adicionarConta(Conta conta){
        contas.add(conta);
    }
}
