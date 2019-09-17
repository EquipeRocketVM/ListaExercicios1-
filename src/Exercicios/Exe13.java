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
public class Exe13 {

    /**
     * Fazer um algoritmo que leia três números e imprime o maior deles.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Digite o primeiro número:");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = sc.nextInt();
        System.out.println("Digite o terceiro número:");
        num3 = sc.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("O primeiro número é o maior");
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("O segundo número é o maior");
        } else if ((num3 > num1) && (num3 > num2)) {
            System.out.println("O terceiro número é o maior");
        } 
    }
}
