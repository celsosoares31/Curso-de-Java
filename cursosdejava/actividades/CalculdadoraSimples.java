/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursosdejava.actividades;

import java.util.Scanner;

/**
 *Para criar uma calculadora simples você vai precisar receber três informações pelo console. 
 * São os dois números que participarão da operação e também a operação que será realizada.
 * Você vai receber o primeiro número, depois vai receber qual é a operação e, por último, o segundo número.
 * Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos aqui no curso - o *Scanner*. 
 * Para receber a operação você pode receber também um número que vai indicar a mesma. 
 * Por exemplo, o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão. 
 * Com esses três valores - os dois números e qual será a operação - você pode utilizar a estrutura de decisão if para só realizar a operação que o usuário escolheu. 
 * Se estiver com dúvidas, então volte a aula onde falamos sobre alteração do valor de uma variável - aula 3.10.
 * 
 * @author celso
 */
public final class CalculdadoraSimples {
    private Double num1, num2, resultado;
    private Byte opc;
    Scanner EntradaDeDados = new Scanner(System.in);
    
    private void CapturaDados(){
        System.out.println("Digite o primeiro valor: ");
        this.num1 = EntradaDeDados.nextDouble();
        Menu();
        System.out.println("Digite o Segundo valor: ");
        this.num2 = EntradaDeDados.nextDouble();
    }
    private void Menu(){
        System.out.println("Escolha a Operacao que pretende realizar: \n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão\n");
        opc = EntradaDeDados.nextByte();
    }
    
    public void calculdadoraSimples(){
        CapturaDados();
        switch (opc) {
            case 1:
                System.out.println("O resultado da Adição de " + num1 + " e " + num2 + " = " + this.adicao(num1, num2));
                break;
            case 2:
                System.out.println("O resultado da Subtração de " + num1 + " e " + num2 + " = " + this.subtracao(num1, num2));
                break;
            case 3:
                System.out.println("O resultado da Multiplicação de " + num1 + " e " + num2 + " = " + this.multiplicacao(num1, num2));
                break;
            case 4:
                Double rse = this.divisao(num1, num2);
                if(rse == null){
                    System.out.println("O Denominador nao pode ser nulo\n");
                }else{
                   System.out.println("O resultado da Multiplicação de " + num1 + " e " + num2 + " = " + rse); 
                }
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
    private Double adicao(Double num1A, Double num2A){
        return this.resultado = num1A + num2A;
    } 
    private Double subtracao(Double num1A, Double num2A){
        return this.resultado = num1A - num2A;
    } 
    public Double multiplicacao(Double num1A, Double num2A){
        return this.resultado = num1A * num2A;
    } 
    public Double divisao(Double num1A, Double num2A){
        if(num2 != 0){
           return this.resultado = num1A / num2A; 
        }else{
            return null;
        }
        
    } 
}
