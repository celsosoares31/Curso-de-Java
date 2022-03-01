/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursosdejava.actividades;

/**
 *
 * @author celso
 */
public class PassouChumbou {
    Boolean resultado;
    
    public Boolean Status(Double nota){
        this.resultado = nota > 70;
        
        return resultado;
    }
}
