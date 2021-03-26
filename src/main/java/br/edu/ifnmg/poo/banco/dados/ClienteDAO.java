/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.banco.dados;

import br.edu.ifnmg.poo.banco.modelo.Cliente;
import br.edu.ifnmg.poo.excecoes.ClienteNaoEncontradoException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author helder
 */
public class ClienteDAO {
    
    private static Map<String,Cliente> clientes = new HashMap<>();
    
    public static void adicionarCliente(Cliente cliente){
        clientes.put(cliente.getNome(), cliente);
    }

    public static Cliente buscarCliente(String nomeCliente) {
        Cliente cliente = clientes.get(nomeCliente);
        if(cliente == null){
            ClienteNaoEncontradoException e = new ClienteNaoEncontradoException();
            throw e;
        }
        
        return cliente;
    }
    
}
