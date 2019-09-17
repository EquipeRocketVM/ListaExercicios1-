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
public class Exe11 {
    /**
     * Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for
     * negativo, imprimir na tela a mensagem "Numero negativo"
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        
        if(num < 0){
            System.out.println("Este número é negativo");
            
        } else {
            System.out.println("Este número é positivo");
        }
    }
}
