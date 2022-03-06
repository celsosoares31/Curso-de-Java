/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursosdejava.actividades;

/**
 *
 * Repare nos vetores abaixo:

Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

* Os quatro primeiros vetores estão guardando o faturamento diário de cada semana e o último vetor, que é de 2 dimensões, 
* guarda o faturamento mensal separado por semanas.
* Crie um algoritmo que encontre qual a semana teve o maior faturamento. No final mostre qual foi essa semana e de quanto foi esse faturamento.
 * 
 * @author celso
 */
public class MaiorFacturamentoSemanal {
    Double[] semanaUm = new Double[]{ 1000.0, 9500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
    Double[] semanaDois = new Double[]{ 1050.0, 200.0, 3250.0, 198500.0, 1430.0, 900.0, 0.0 };
    Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 25450.0, 2000.0, 1390.0, 800.0, 0.0 };
    Double[] semanaQuatro = new Double[]{ 1100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

    Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
    Double maiorFacturamento=0.0, facturamentoTotal;
    int semanaComMaiorFacturamento;
    
    
    
    private String nomeDaSemana(int num){
        String resp = null;
        switch (num) {
            case 0:
                resp = "semanaUm";
                break;
            case 1:
                resp = "semanaDois";
                break;
            case 2:
                resp = "semanaTres";
                break;
            case 3:
                resp = "semanaQuatro";
                break;
        }
        
        return resp;
    }
    
    public void EncontraMaiorFacturamento(int num, int i){
        /*for (int i = 0; i < mes.length; i++) {
            facturamentoTotal = 0.0;
            Double[] semana = mes[i];
            
            for (int j = 0; j < semana.length; j++) {
                facturamentoTotal += semana[j];
            }
            
            if(facturamentoTotal > maiorFacturamento){
                maiorFacturamento = facturamentoTotal;
                semanaComMaiorFacturamento = i;
            }
        }
        
        System.out.println("A Semana com maior facturamento é a semana: " + this.nomeDaSemana(semanaComMaiorFacturamento));
        System.out.println("E o respectivo facturamento foi de: " + maiorFacturamento);*/
        System.out.println(". " + num + " x " + i + " = " + num * i);
        
        ++i;
        if(i <= 10){
           EncontraMaiorFacturamento(num, i); 
        }
    }
}
