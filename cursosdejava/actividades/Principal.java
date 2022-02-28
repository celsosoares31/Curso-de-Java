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
        Double troco;
        //A linha abaixo instancia o objecto da classe CalculadoraValorTrocos
        CalculadoraValorTrocos trocos = new CalculadoraValorTrocos();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o valor a pagar: ");
        trocos.setValorPagar(in.nextDouble());
        
        System.out.println("Digite o valor passado pelo cliente ");
        trocos.setValorPago(in.nextDouble());
        
        troco = trocos.calcularTrocos();
        System.out.println("O Troco que o cliente deve receber e: " + troco);
        in.close();
    }
}