/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursosdejava.actividades;

import com.cursosdejava.aulas.tiposdedados.TipoTexto;
import java.util.Scanner;

/**
 *
 * @author celso
 */
public class Principal {
    public static void main(String[] args){
        Double troco, pesoP, alturaP, numP, notaP;
        String nomeP, sobreNomeP;
        //A linha abaixo instancia o objecto da classe CalculadoraValorTrocos
        //TrocosDeVenda trocos = new TrocosDeVenda();
        Scanner in = new Scanner(System.in);
        /*System.out.println("\n------------------- Calculadora de Trocos----------------------------\n");
        System.out.println("Digite o valor a pagar: ");
        trocos.setValorPagar(in.nextDouble());
        System.out.println("Digite o valor passado pelo cliente ");
        trocos.setValorPago(in.nextDouble());
        troco = trocos.calcularTrocos();
        System.out.println("O Troco que o cliente deve receber e: " + troco);
        
        
        System.out.println("\n------------------- Calculadora de Massa Corporal ----------------------------\n");
        System.out.println("Digite a sua altura: ");
        alturaP = in.nextDouble();
        System.out.println("Difite o seu peso ");
        pesoP = in.nextDouble();
        
        MassaCorporal IMC = new MassaCorporal();
        System.out.println("O seu indice the massa corporal e: " + IMC.calculaMassaCorporal(pesoP, alturaP));
        
        System.out.println("\n------------------- Calculadora do quadrado de um numero ----------------------------\n");
        System.out.println("Digite um numero: ");
        numP = in.nextDouble();
        
        QuadradoDeNumero quadradoNum = new QuadradoDeNumero();
        System.out.println("O Quadrado de " + numP + " e: " + quadradoNum.SQRT(numP));
       
        System.out.println("\n------------------- IMPRESSAO DO NOME COMPLETO ----------------------------\n");
        System.out.println("Digite o teu nome: ");
        nomeP = in.nextLine();
        System.out.println("Digite o teu sobrenome: ");
        sobreNomeP = in.nextLine();
        
        TipoTexto nomeCompleto = new TipoTexto(nomeP, sobreNomeP);
        System.out.println("Ola " + nomeCompleto.getNomeCompleto());
       
        System.out.println("\n------------------- Verifica se um aluno foi aprovado ou nao----------------------------\n");
        System.out.println("Digite o nota do aluno ");
        notaP = in.nextDouble();
        
        PassouChumbou STATUS = new PassouChumbou();
        
        if(STATUS.Status(notaP)){
            System.out.println("O aluno foi Aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
        */
        
        System.out.println("\n------------------- Calcula o desconto ----------------------------\n");
        CalculaDesconto valorTotal = new CalculaDesconto();
        
        valorTotal.desconto();
        
    }
}