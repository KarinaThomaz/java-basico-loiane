package com.loiane.cursoJava.exerciciosAula13;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num1 = scan.nextInt();

        System.out.println("Digite outro número:");
        int num2 = scan.nextInt();

        int soma = num1+num2;

        System.out.println("Soma = " +soma);
    }
}
