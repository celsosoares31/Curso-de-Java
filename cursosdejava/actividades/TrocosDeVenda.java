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
public class TrocosDeVenda {
        private Double valorPago, valorPagar, resultado;
        
        public void setValorPago(Double valor){
            this.valorPago = valor;
        }
        public void setValorPagar(Double valor){
            this.valorPagar = valor;
        }
        public Double calcularTrocos(){
            this.resultado = this.valorPago - this.valorPagar;
            
            return resultado;
        }
}
