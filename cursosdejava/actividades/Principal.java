/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursosdejava.actividades;

import java.util.Scanner;

/**
 *
 * @author celso
 */
public class Principal {
    public static void main(String[] args){
        Double troco, pesoP, alturaP;
        //A linha abaixo instancia o objecto da classe CalculadoraValorTrocos
        TrocosDeVenda trocos = new TrocosDeVenda();
        Scanner in = new Scanner(System.in);
        System.out.println("\n------------------- Calculadora de Trocos----------------------------\n");
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
        
        
        in.close();
    }
}