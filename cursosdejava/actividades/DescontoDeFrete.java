/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursosdejava.actividades;

import java.util.Scanner;

/**
 *Crie um programa que receba o valor de um produto e exiba o valor final da compra. 
 *Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00. 
 * Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
 * Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.
 * 
 * @author celso
 */
public class DescontoDeFrete {
    private int frete = 15;
    private static final int VALOR_MINIMO_PARA_DESCONTO = 100;
    private double total, valorProduto;
    private boolean compraMaiorQueCem;
    
    Scanner in = new Scanner(System.in);
    
    public void calculaDesconto(){
        System.out.println("Informe o valor do produto: ");
        valorProduto = in.nextDouble();
        
        compraMaiorQueCem = valorProduto >= VALOR_MINIMO_PARA_DESCONTO;
        
        if(compraMaiorQueCem){
            frete = 0;
        }
        
        total = valorProduto + frete;
        
        System.out.println("O valor total a pagar é: " + total);
    }
}
