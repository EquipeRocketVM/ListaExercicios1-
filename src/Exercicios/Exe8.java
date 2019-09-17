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
public class Exe8 {

    /**
     * Fazer um algoritmo que leia quatro números e imprime a média aritmética
     * dos quatro números.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota1,nota2,nota3,nota4,media;
        
        System.out.println("Bem vindo, vamos calcular a média aritmetica");
        
        System.out.println("Digite a nota 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3: ");
        nota3 = sc.nextDouble();
        System.out.println("Digite a nota 4: ");
        nota4 = sc.nextDouble();
        
        media = (nota1 + nota2 + nota3 + nota4) /4;
        
        System.out.println("A média aritmética dos números foi: " + media);
    }
}
