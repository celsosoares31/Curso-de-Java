/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursosdejava.actividades;

/**
 *
 * @author celso
 */
public class MassaCorporal {
   private double IMC;
   
   public Double calculaMassaCorporal(Double pesoA, Double alturaA){
       this.IMC = pesoA/(alturaA*alturaA);
       
       return IMC;
   }
}
