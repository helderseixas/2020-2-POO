/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.banco.controle;

import br.edu.ifnmg.poo.banco.dados.ClienteDAO;
import br.edu.ifnmg.poo.banco.modelo.Cliente;
import br.edu.ifnmg.poo.excecoes.ClienteNaoEncontradoException;

/**
 *
 * @author helder
 */
public class ClienteControlador {
    
    public void cadastrarCliente(Cliente cliente){
        ClienteDAO.adicionarCliente(cliente);
    }

    public Cliente buscarCliente(String nomeCliente) {
        return ClienteDAO.buscarCliente(nomeCliente);
    }
    
}
