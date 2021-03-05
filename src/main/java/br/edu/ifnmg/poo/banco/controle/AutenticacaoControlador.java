/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.banco.controle;

import br.edu.ifnmg.poo.banco.dados.ContaDAO;
import br.edu.ifnmg.poo.banco.modelo.Cliente;
import br.edu.ifnmg.poo.banco.modelo.Conta;

/**
 *
 * @author helder
 */
public class AutenticacaoControlador {

    public Conta autenticar(String numeroConta, String senhaCliente) {
        Conta contaRecuperada = ContaDAO.getConta(numeroConta);
        if(contaRecuperada != null){
            Cliente clienteDonoConta = contaRecuperada.getCliente();
            if(clienteDonoConta.verificarSenha(senhaCliente)){
                return contaRecuperada;
            }else{
                return null;
            }
        }else{
            return null;
        }
    }
    
}
