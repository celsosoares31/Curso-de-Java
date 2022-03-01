/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursosdejava.actividades;

/**
 *
 *Dada a lista de números abaixo:
 *Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
 *... Itere por essa lista e imprima todos os números que são divisíveis por 3.
 *Para descobrir se um número é divisível por 3, você pode utilizar o operador módulo. Toda vez que o módulo de um número por 3 for igual a zero, então esse número e divisível por 3.
 *
 * 
 * @author celso
 */

public class DivisivelPorTres {
    Integer[] numeros = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,20};
    
    public void divisor(){
        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i]%3; 
            if(num == 0){
                System.out.println(numeros[i]);
            }
        }
    }
}
