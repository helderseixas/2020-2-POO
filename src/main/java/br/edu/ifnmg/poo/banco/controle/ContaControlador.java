/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.banco.controle;

import br.edu.ifnmg.poo.banco.dados.ContaDAO;
import br.edu.ifnmg.poo.banco.modelo.Conta;

/**
 *
 * @author helder
 */
public class ContaControlador {
    
    public void cadastrarConta(Conta conta){
        ContaDAO.adicionarConta(conta);
    }
    
}
