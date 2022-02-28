/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursosdejava.aulas.tiposdedados;

/**
 *
 * @author celso
 */
public class TipoTexto {
   private String nomeCompleto;
   
   public TipoTexto(String nome, String sobreNome){
       this.nomeCompleto = nome + sobreNome;
   }
   
   public String getNomeCompleto(){
       return this.nomeCompleto;
   }
}
