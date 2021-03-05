/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.banco.test;

import br.edu.ifnmg.poo.banco.controle.AutenticacaoControlador;
import br.edu.ifnmg.poo.banco.dados.ContaDAO;
import br.edu.ifnmg.poo.banco.modelo.Cliente;
import br.edu.ifnmg.poo.banco.modelo.Conta;
import br.edu.ifnmg.poo.banco.modelo.ContaCorrente;
import br.edu.ifnmg.poo.banco.modelo.PessoaFisica;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author helder
 */
public class AutenticacaoTest {
    
    public AutenticacaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testAutenticacaoComSucesso() {
        String numeroConta = "001";
        String senhaCliente = "1234";
        
        Cliente cliente = new PessoaFisica("João", senhaCliente, 1000);        
        ContaCorrente contaCorrente = new ContaCorrente(numeroConta, cliente, 1000);
        ContaDAO.adicionarConta(contaCorrente);
                        
        AutenticacaoControlador controlador = new AutenticacaoControlador();
        Conta contaAutenticada = controlador.autenticar(numeroConta, senhaCliente);
        assertEquals(numeroConta, contaAutenticada.getNumero());        
    }
    
    @Test
    public void testAutenticacaoSenhaInvalida(){
        String numeroConta = "001";
        String senhaCliente = "1234";
        
        Cliente cliente = new PessoaFisica("João", senhaCliente, 1000);        
        ContaCorrente contaCorrente = new ContaCorrente(numeroConta, cliente, 1000);
        ContaDAO.adicionarConta(contaCorrente);
                        
        AutenticacaoControlador controlador = new AutenticacaoControlador();
        String senhaDiferente = "1111";
        Conta contaAutenticada = controlador.autenticar(numeroConta, senhaDiferente);
        assertEquals(null, contaAutenticada);                
    }
    
    @Test
    public void testAutenticacaoContaInvalida(){
        String numeroConta = "001";
        String senhaCliente = "1234";
        
        Cliente cliente = new PessoaFisica("João", senhaCliente, 1000);        
        ContaCorrente contaCorrente = new ContaCorrente(numeroConta, cliente, 1000);
        ContaDAO.adicionarConta(contaCorrente);
                        
        AutenticacaoControlador controlador = new AutenticacaoControlador();
        String numeroContaDiferente = "002";
        Conta contaAutenticada = controlador.autenticar(numeroContaDiferente, senhaCliente);
        assertEquals(null, contaAutenticada);                
    }
}
