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
public class Exe14 {
    /**
     * Fazer um algoritmo que leia dois números e imprime a divisão do maior
     * pelo menor.
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, resultado;
        
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();
        
        if (num1 > num2){
        resultado= num1 / num2;
            System.out.println("O primeiro número é o maior e a divisão foi de: " + resultado);
        } else if (num2 > num1){
            resultado = num2 / num1;
            System.out.println("O segundo número é o maior e a divisão foi de: " + resultado);
        }
        
    }
}
