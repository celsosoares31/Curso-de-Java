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
public class CalculadoraValorTrocos {
        private Double valorPago, valorPagar, resultado;
         
        public Double calcularTrocos(){
            Scanner in = new Scanner(System.in);
            
            System.out.println("Digite o valor a pagar: ");
            this.valorPagar = in.nextDouble();
            System.out.println("Digite o valor passado pelo cliente ");
            this.valorPago = in.nextDouble();
           
            resultado = valorPago - valorPagar;
            
            this.resultado = valorPago - valorPagar;
            
            in.close();
            return resultado;
        }
}
