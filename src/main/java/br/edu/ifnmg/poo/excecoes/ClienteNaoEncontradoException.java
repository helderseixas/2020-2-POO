/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.excecoes;

/**
 *
 * @author helder
 */
public class ClienteNaoEncontradoException extends NegocioException {
    
    public ClienteNaoEncontradoException(){
        super("Cliente não econtrado!");
    }
}
