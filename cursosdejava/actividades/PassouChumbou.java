/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursosdejava.actividades;

import java.util.Scanner;

/**
 *Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
 *Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
 * A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150. 
 * Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, 
 * se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
 * No final mostre para o candidato se ele conseguiu ou não.
 * 
 *
 * @author celso
 */
public class PassouChumbou {
    private static final Integer NOTA_MINIMA_PARA_APROVACAO_DO_ALUNO = 150;
    private static final Integer NOTA_MINIMA_EM_CADA_TESTE = 60;
    private double notaPortugues, notaMatematica;
    
    private boolean verificaAsNotas(){
        Scanner entrada = new Scanner(System.in);
        boolean situacaoDasNotas;
        
        System.out.println("Digite a nota de Portugues: ");
        this.notaPortugues = entrada.nextDouble();
        System.out.println("Digite a nota de Matematica: ");
        this.notaMatematica = entrada.nextDouble();
        
        if(notaPortugues > NOTA_MINIMA_EM_CADA_TESTE && notaMatematica>NOTA_MINIMA_EM_CADA_TESTE){
            situacaoDasNotas = true;
        }else{
            situacaoDasNotas = false;
        }
        
        return situacaoDasNotas;
    }
        
    public void SituacaoDoAluno(){
        boolean statusNotas;
        double resultadoFinal;
        
        statusNotas = verificaAsNotas();
        
        if(statusNotas){
            resultadoFinal = this.notaMatematica + this.notaPortugues;
            if(resultadoFinal >= NOTA_MINIMA_PARA_APROVACAO_DO_ALUNO){
                System.out.println("O Aluno esta Aprovado,");
            }else{
                System.out.println("O aluno esta reprovado.");
            }
        }else{
            System.out.println("O aluno esta reprovado.");
        }
    }
}
