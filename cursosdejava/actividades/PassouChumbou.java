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
    static final Integer NOTA_MINIMA_PARA_APROVACAO_DO_ALUNO = 70;
    
    public Boolean Status(Double nota){
        this.resultado = nota > NOTA_MINIMA_PARA_APROVACAO_DO_ALUNO;
        
        return resultado;
    }
}
