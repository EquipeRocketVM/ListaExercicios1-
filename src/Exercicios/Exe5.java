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
public class Exe5 {

    /**
     * Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de
     * lado L.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l, resultado;

        System.out.println("Vamos calcular a área de um quadrado!");
        System.out.println("Insira o valor: ");
        l = sc.nextInt();

        resultado = l * l;
        System.out.println("A área do quadrado é: " + resultado);
    }
}
