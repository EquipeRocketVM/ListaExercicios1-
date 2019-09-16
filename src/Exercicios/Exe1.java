package Exercicios;

import java.util.Scanner;

/**
 *
 * @author Vitoria Cristina
 */
public class Exe1 {

    /**
     * Exercicio: Fazer um algoritmo que leia dois números e imprima na tela o
     * produto (multiplicação) dos dois números.
     *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, resultado;

        System.out.println("Bem vindo");
        System.out.println("Insira o primeiro número: ");
        num1 = sc.nextInt();
        System.out.println("Insira o segundo número: ");
        num2 = sc.nextInt();
        resultado = (num1 * num2);
        System.out.println("O resultado da multiplicação dos dois números é: " + resultado);
    }
}
