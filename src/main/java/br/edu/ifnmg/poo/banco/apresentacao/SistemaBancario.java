/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.banco.apresentacao;

import br.edu.ifnmg.poo.banco.controle.AutenticacaoControlador;
import br.edu.ifnmg.poo.banco.controle.ClienteControlador;
import br.edu.ifnmg.poo.banco.controle.ContaControlador;
import br.edu.ifnmg.poo.banco.modelo.Cliente;
import br.edu.ifnmg.poo.banco.modelo.Conta;
import br.edu.ifnmg.poo.banco.modelo.ContaCorrente;
import br.edu.ifnmg.poo.banco.modelo.PessoaFisica;
import br.edu.ifnmg.poo.excecoes.ClienteNaoEncontradoException;
import br.edu.ifnmg.poo.excecoes.NegocioException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author helder
 */
public class SistemaBancario {
    
    public static void main(String[] parametros){
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        do{
            try{
                System.out.println("\n\n***Menu***");
                System.out.println("Operação: ");
                System.out.println("1 - Cadastrar cliente");
                System.out.println("2 - Cadastrar conta");
                System.out.println("3 - Autenticar conta");            
                System.out.println("0 - Sair");
                System.out.println("Informe a operação: ");

                operacao = Integer.parseInt(scanner.nextLine());

                if(operacao == 1){
                    cadastarCliente(scanner);
                }else if(operacao == 2){
                    cadastrarConta(scanner);
                }else if(operacao == 3){
                    autenticarConta(scanner);
                }
            }catch(NumberFormatException e){
                System.out.println("\nValor inválido! Tente novamente.");
                operacao = -1;
            }catch(NegocioException e)        {
                System.out.printf("\n%s\n", e.getMessage());
                System.out.println("Tente novamente.");
            }catch(Exception e){
                System.out.println("\nUm erro ocorreu no sistema! Tente novamente. Caso o problema persista, informe ao administrador do sistema.");
                operacao = -1;                
            }

        }while(operacao != 0);
    }

    private static void cadastarCliente(Scanner scanner) {
        System.out.println("\nCadastro de Pesso Física (F) ou Pessoa Jurídica (J): ");
        char tipoCliente = scanner.nextLine().charAt(0);
        
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Senha: ");
        String senha = scanner.nextLine();
                
        Cliente cliente = null;
        if(tipoCliente == 'F'){
            System.out.println("Salário: ");
            double salario = 0;
            try{                
                 salario = Double.parseDouble(scanner.nextLine());
            }catch(NumberFormatException e){
                System.out.println("\nSalário informado é inválido!");
                throw e;
            }
            cliente = new PessoaFisica(nome, senha, salario);
        }else{
            //TODO: implementar a parte de pessoa jurídica
        }
        
        ClienteControlador clienteControlador = new ClienteControlador();
        clienteControlador.cadastrarCliente(cliente);
        
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void cadastrarConta(Scanner scanner) {
        System.out.println("\nCadastro de Contar Corrente (C) ou Conta Poupanca (P): ");
        char tipoConta = scanner.nextLine().charAt(0);
        
        Cliente cliente = null;
        
        System.out.println("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        ClienteControlador clienteControlador = new ClienteControlador();        
        cliente = clienteControlador.buscarCliente(nomeCliente);

        System.out.println("Número da conta: ");
        String numeroConta = scanner.nextLine();
        
        System.out.println("Saldo: ");
        double saldo = Double.parseDouble(scanner.nextLine());
        
        Conta conta = null;
        if(tipoConta == 'C'){
            conta = new ContaCorrente(numeroConta, cliente, saldo);
        }else{
            //TODO: implementar a parte de conta corrente
        }
        
        ContaControlador contaControlador = new ContaControlador();
        contaControlador.cadastrarConta(conta);        
    }

    private static void autenticarConta(Scanner scanner) {
        System.out.println("\nNúmero da conta: ");
        String numeroConta = scanner.nextLine();
        
        System.out.println("Senha: ");
        String senha = scanner.nextLine();
        
        AutenticacaoControlador autenticacaoControlador = new AutenticacaoControlador();
        Conta contaAutenticada = autenticacaoControlador.autenticar(numeroConta, senha);
        
        System.out.printf("Conta autenticada: número %s - cliente %s", 
                contaAutenticada.getNumero(), 
                contaAutenticada.getCliente().getNome());
    }
    
}
