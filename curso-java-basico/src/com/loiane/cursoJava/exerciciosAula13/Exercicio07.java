package com.loiane.cursoJava.exerciciosAula13;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o tamanho do lado do quadrado:");
        double lado = scan.nextDouble();
        double area = Math.pow(lado, 2);
        System.out.println(area);
        System.out.println(area*2);
    }
}
