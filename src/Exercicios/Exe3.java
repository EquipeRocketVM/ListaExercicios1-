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
public class Exe3 {

    /**
     * Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos
     * dois números.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, resultado;

        System.out.println("Bem vindo, iremos calcular o quadrado de um número!");
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        num1 = (num1 * num1);
        num2 = (num2 * num2);
        resultado = num1 + num2;

        System.out.println("O resultado é: " + resultado);
    }
}
