/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cursosdejava.actividades;

/**
 *
 * @author celso
 */
public class Principal {
    public static void main(String[] args){
        /*Double troco, pesoP, alturaP, numP, notaP;
        String nomeP, sobreNomeP;
        //A linha abaixo instancia o objecto da classe CalculadoraValorTrocos
        //TrocosDeVenda trocos = new TrocosDeVenda();
        Scanner in = new Scanner(System.in);
        System.out.println("\n------------------- Calculadora de Trocos----------------------------\n");
        System.out.println("Digite o valor a pagar: ");
        trocos.setValorPagar(in.nextDouble());
        System.out.println("Digite o valor passado pelo cliente ");
        trocos.setValorPago(in.nextDouble());
        troco = trocos.calcularTrocos();
        System.out.println("O Troco que o cliente deve receber e: " + troco);
        
        
        System.out.println("\n------------------- Calculadora de Massa Corporal ----------------------------\n");
        System.out.println("Digite a sua altura: ");
        alturaP = in.nextDouble();
        System.out.println("Difite o seu peso ");
        pesoP = in.nextDouble();
        
        MassaCorporal IMC = new MassaCorporal();
        System.out.println("O seu indice the massa corporal e: " + IMC.calculaMassaCorporal(pesoP, alturaP));
        
        System.out.println("\n------------------- Calculadora do quadrado de um numero ----------------------------\n");
        System.out.println("Digite um numero: ");
        numP = in.nextDouble();
        
        QuadradoDeNumero quadradoNum = new QuadradoDeNumero();
        System.out.println("O Quadrado de " + numP + " e: " + quadradoNum.SQRT(numP));
       
        System.out.println("\n------------------- IMPRESSAO DO NOME COMPLETO ----------------------------\n");
        System.out.println("Digite o teu nome: ");
        nomeP = in.nextLine();
        System.out.println("Digite o teu sobrenome: ");
        sobreNomeP = in.nextLine();
        
        TipoTexto nomeCompleto = new TipoTexto(nomeP, sobreNomeP);
        System.out.println("Ola " + nomeCompleto.getNomeCompleto());
      
        System.out.println("\n------------------- Verifica se um aluno foi aprovado ou nao----------------------------\n");
        
        PassouChumbou STATUS = new PassouChumbou();
        
        STATUS.SituacaoDoAluno();
        
       
        System.out.println("\n------------------- Calcula o desconto ----------------------------\n");
        CalculaDesconto valorTotal = new CalculaDesconto();
        
        valorTotal.desconto();
        
        System.out.println("\n------------------- Calculadora Simples----------------------------\n");
        CalculdadoraSimples calculadoraSimples = new CalculdadoraSimples();
        
        calculadoraSimples.calculdadoraSimples();
        
        
        System.out.println("\n------------------- Calculadora de desconto de frete----------------------------\n");
        DescontoDeFrete descFrete = new DescontoDeFrete();
        
        descFrete.calculaDesconto();
        
        System.out.println("\n------------------- Interacao Usando O for----------------------------\n");
        DivisivelPorTres forInteracao = new DivisivelPorTres();
        
        
        forInteracao.divisor();
        
        System.out.println("\n------------------- Encontrar o maior facturamanto----------------------------\n");
        MaiorFacturamentoSemanal facturamento = new MaiorFacturamentoSemanal();
        
        facturamento.EncontraMaiorFacturamento(1,1);
      
        
       System.out.println("\n------------------ Verifica a quantidade de estoque ----------------------------\n");
       Produto produto1 = new Produto();
       
       produto1.nome = "laranja";
       produto1.quantidade = 10;
       System.out.println("SItuacao do Estoque: " + produto1.reporStoque());
       
       */
       System.out.println("\n------------------ Mostra Informacoes do pedido ----------------------------\n");
       Pedido pedido = new Pedido();
       Pedido pedido1 = new Pedido();
       Pedido pedido2 = new Pedido();
       Pedido pedido3 = new Pedido();
       
      pedido.setDesconto(20.0);
      pedido.setSubtTotal(80.0);
      
      pedido1.setDesconto(15.0);
      pedido1.setSubtTotal(89.0);
      
     
      pedido2.setDesconto(29.0);
      pedido2.setSubtTotal(180.0);
    
      
      pedido3.setDesconto(190.0);
      pedido3.setSubtTotal(8990.0);
     
      
       System.out.println("\nO Codigo e: " + pedido.getID()+ "\nO Desconto e igual a : " + pedido.getDesconto());
       System.out.println("O subTotal e : " + pedido.getSubtTotal());
       System.out.println("O Total: " + pedido.getTotal());
      
       System.out.println("\nO Codigo e: " + pedido1.getID()+ "\nO Desconto e igual a : " + pedido1.getDesconto());
        System.out.println("O subTotal e : " + pedido1.getSubtTotal());
        System.out.println("O Total: " + pedido1.getTotal());
        
        System.out.println("\nO Codigo e: " + pedido2.getID()+ "\nO Desconto e igual a : " + pedido2.getDesconto());
       System.out.println("O subTotal e : " + pedido2.getSubtTotal());
       System.out.println("O Total: " + pedido2.getTotal());
      
       System.out.println("\nO Codigo e: " + pedido3.getID()+ "\nO Desconto e igual a : " + pedido3.getDesconto());
        System.out.println("O subTotal e : " + pedido3.getSubtTotal());
        System.out.println("O Total: " + pedido3.getTotal());
        
    }
}