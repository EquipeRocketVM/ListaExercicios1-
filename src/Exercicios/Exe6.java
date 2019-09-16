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
public class Exe6 {

    /**
     * Escreva um algoritmo que leia três números decimais: A, B e C. Em
     * seguida, calcule e mostre: a) a área do triângulo retângulo que tem A por
     * base e C por altura. b) a área do círculo de raio C. (π = 3.14159) c) a
     * área do trapézio que tem A e B por bases e C por altura. d) a área do
     * quadrado que tem lado B. e) a área do retângulo que tem lados A e B. f) o
     * perímetro do retângulo que tem lados A e B.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, perimetroRetangulo;

        System.out.println("Digite o primeiro número: ");
        a = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        b = sc.nextDouble();
        System.out.println("Digite o terceiro número: ");
        c = sc.nextDouble();

        triangulo = (a * c) / 2;
        System.out.println("A área do triângulo retangulo do componente base A e altura por C: " + triangulo);

        circulo = Math.PI * Math.pow(c, 2.0);
        System.out.println("A área do círculo de raio c é : " + circulo);

        trapezio = (c * (a + b)) / 2;
        System.out.println("A área do trapezio com altura C e bases A e B é: " + trapezio);

        quadrado = (b * b);
        System.out.println("A área do quadrado de lado B é: " + quadrado);

        retangulo = (a * b);
        System.out.println("A área do retangulo com lado A e B é: " + retangulo);

        perimetroRetangulo = (a + b);
        System.out.println("O perimetro do retangulo com lado A + B é: " + perimetroRetangulo);

        System.out.println("Fim.");

    }

}
