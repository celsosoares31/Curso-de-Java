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
public class CalculaDesconto {
    Integer qtdProduto;
    Double valorProduto, descontoP = 0.0, valorPagar, desconto, subTotal, total;
    Boolean qtdDesejada;
    
    
    public void desconto(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto:");
        valorProduto = entrada.nextDouble();
        System.out.println("Digite a quantidade do produto");
        qtdProduto = entrada.nextInt();
        
        subTotal = valorProduto * qtdProduto;
        qtdDesejada = qtdProduto > 10;
        
        if(qtdDesejada){
            descontoP = 10.0;
        }
        
        desconto = (subTotal*descontoP)/100;
        total = subTotal - desconto;
        
        System.out.println("O valor Subtotal: " + subTotal);
        System.out.println("O valor a descontar : " + desconto);
        System.out.println("O valor a pagar e: " + total);
        
        entrada.close();
    }
}
