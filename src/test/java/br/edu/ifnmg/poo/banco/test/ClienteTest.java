/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.banco.test;

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
public class ClienteTest {
    
    public ClienteTest() {
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
    public void testCriarPessoaFisica() {
        String nome = "Joao";
        String senha = "1234";
        double salario = 2000;
        PessoaFisica pessoaFisica = new PessoaFisica(nome, senha, salario);
        assertEquals(nome, pessoaFisica.getNome());
        assertEquals(salario, pessoaFisica.getSalario(), 0);        
    }
    
    @Test
    public void testCriarPessoaFisicaComSalarioInvalido(){
        String nome = "Joao";
        String senha = "1234";
        double salario = -1;
        PessoaFisica pessoaFisica = new PessoaFisica(nome, senha, salario);        
        assertEquals(0, pessoaFisica.getSalario(), 0);        
    }
}
