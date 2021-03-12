/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.banco.dados;

import br.edu.ifnmg.poo.banco.modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author helder
 */
public class ClienteDAO {
    
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    
    public static void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public static Cliente buscarCliente(String nomeCliente) {
        Cliente cliente = null;
        for(Cliente clienteEmPesquisa : clientes){
            if(clienteEmPesquisa.getNome().equals(nomeCliente)){
                cliente = clienteEmPesquisa;
                break;
            }
        }
        return cliente;
    }
    
}
