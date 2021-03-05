/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.banco.test;

import br.edu.ifnmg.poo.banco.modelo.Cliente;
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
public class ContaTest {
    
    public ContaTest() {
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
    public void testCriarContaCorrente() {
        String numero = "001";
        Cliente cliente = new PessoaFisica("João", "1234", 1000);
        double saldo = 10000;
        ContaCorrente contaCorrente = new ContaCorrente(numero, cliente, saldo);
        assertEquals(numero, contaCorrente.getNumero());
        assertEquals(cliente, contaCorrente.getCliente());
        assertEquals(saldo, contaCorrente.getSaldo(), 0);
    }
}
