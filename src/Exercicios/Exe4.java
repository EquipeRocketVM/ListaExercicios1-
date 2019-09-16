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
public class Exe4 {

    /**
     * Fazer um algoritmo que lê dois números inteiros e imprime os números
     * consecutivos desses números.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, resultado1, resultado2;

        System.out.println("Bem vindo, vamos imprimir números consecutivos ");
        System.out.println("Digite o primeiro número que você quer o sequencial: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número que você quer o sequencial: ");
        num2 = sc.nextInt();

        resultado1 = num1 + 1;
        resultado2 = num2 + 1;

        System.out.println("Resultado 1: " + resultado1 + " e o resultado 2: " + resultado2);
    }
}
