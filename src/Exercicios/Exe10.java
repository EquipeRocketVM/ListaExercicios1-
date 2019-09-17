/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Vitoria Cristina
 */
public class Exe10 {

    /**
     * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o
     * total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
     * vendedor ganha 15% de comissão sobre suas vendas efetuadas, calcular e
     * imprimir o total a receber no final do mês.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeVendedor;
        int vendas;
        double salarioF, resultado, resultado2;

        System.out.println("Bem vindo!");
        System.out.println("Digite o nome do vendedor: ");
        nomeVendedor = sc.next();
        System.out.println("Digite o salário do vendedor: ");
        salarioF = sc.nextDouble();
        System.out.println("Digire o total de vendas efetuadas do mês: ");
        vendas = sc.nextInt();

        resultado = (vendas * 15) / 100 ;
        resultado2 = resultado + salarioF;
        
        System.out.println("O vendedor " + nomeVendedor
                + " obteve de comissão de vendas: R$"
                + resultado + " salário desse mês ficou no total de: R$" + resultado2);

    }
}
