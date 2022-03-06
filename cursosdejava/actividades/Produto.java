/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursosdejava.actividades;

/**
 *
 * Crie um programa que contenha um método que verifique a necessidade de repor o estoque de determinado produto em uma loja qualquer.
 * 
 * 
 * @author celso
 */
public class Produto {
    final int QUANTIDADE_MINIMA_PARA_REQUESITAR = 10;
    String nome, situacao;
    int quantidade;
    
    
    public String reporStoque(){
        Boolean status;
        status = QUANTIDADE_MINIMA_PARA_REQUESITAR >= this.quantidade;
        
        if(status){
            situacao = "É Necessario fazer a requesicao de estoque";
        }else{
            situacao = "Ainda existe estoque sufuciente nao ha necessidade de fazer a requesicao";
        }
        return situacao;
    }
}
