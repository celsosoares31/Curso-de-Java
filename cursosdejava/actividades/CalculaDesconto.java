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
    Integer qtdProduto, descontoP = 0;
    Double valorProduto, valorPagar, desconto, subTotal, total;
    Boolean qtdDesejada;
    
    static final Integer PERCENTUAL_DE_DESCONTO = 10;
    
    public void desconto(){
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Digite o valor do produto:");
        valorProduto = entrada.nextDouble();
        System.out.println("Digite a quantidade do produto");
        qtdProduto = entrada.nextInt();
        
        subTotal = valorProduto * qtdProduto;
        qtdDesejada = qtdProduto > 10;
        
        if(qtdDesejada){
            descontoP = PERCENTUAL_DE_DESCONTO;
        }
        
        desconto = (subTotal*descontoP)/100;
        total = subTotal - desconto;
        
        System.out.println("O valor Subtotal: " + subTotal);
        System.out.println("O valor a descontar : " + desconto);
        System.out.println("O valor a pagar e: " + total);
        
        entrada.close();
    }
}
