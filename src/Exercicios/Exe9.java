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
public class Exe9 {

    /**
     * Escreva um programa que leia o número de cadastro de um funcionário, seu
     * número de horas trabalhadas, o valor que recebe por hora e calcula o
     * salário desse funcionário. A seguir, mostre na tela o número e o salário
     * do funcionário.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codCliente, horaT;
        double valor, salario;

        System.out.println("Digite o código do funcionário: ");
        codCliente = sc.nextInt();
        System.out.println("Digite as horas trabalhadas:  ");
        horaT = sc.nextInt();
        System.out.println("Digite o valor recebido por hora de trabalho: ");
        valor = sc.nextDouble();

        salario = horaT * valor;
        System.out.println("O funcionário com o código: " + codCliente
                + " deverá receber no seu salário o total de: R$" + salario);
    }
}
