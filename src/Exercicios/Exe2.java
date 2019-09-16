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
public class Exe2 {

    /**
     * Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a
     * potência (base elevada ao expoente)
     *
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, expoente, potencia;

        System.out.println("Bem vindo, vamos realizar o cálculo para imprimir o expoente de um número");
        System.out.println("Insira a base: ");
        base = sc.nextInt();
        System.out.println("Insira o expoente: ");
        expoente = sc.nextInt();

        potencia = (int) Math.pow(base, expoente);

        System.out.println("A potência é: " + potencia);

    }
}
