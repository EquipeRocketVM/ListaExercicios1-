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
public class Exe12 {

    /**
     * Fazer um algoritmo que leia dois números L e R. O programa deve verificar
     * a maior área entre um quadrado de lado L e um círculo de raio R. Imprimir
     * na tela qual o maior: "Quadrado" ou "Círculo".
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio, quadrado, l, r;
        System.out.println("Digite o primeiro número: ");
        l = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        r = sc.nextDouble();

        if (l > r) {
            System.out.println("QUADRADO");

        } else {
            System.out.println("CIRCULO");
        }

       /** raio = Math.PI * Math.pow(r, 2.0);
        System.out.println("A área do círculo de raio c é : " + raio);
        quadrado = (l * l);
*/
    }
}
