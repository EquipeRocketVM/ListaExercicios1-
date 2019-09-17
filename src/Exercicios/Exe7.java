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
public class Exe7 {

    /**
     * Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo
     * e calcula a hipotenusa do triângulo. Para esse caso, considere que
     * ℎ𝑖𝑝𝑜𝑡𝑒𝑛𝑢𝑠𝑎 = √𝐴 2 + 𝐵 2
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, hipotenusa;

        System.out.println("Insira o primeiro valor: ");
        a = sc.nextDouble();
        System.out.println("Insira o segundo valor: ");
        b = sc.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
        
        System.out.println("A hipotenusa é : " + hipotenusa);

        
    }
}
