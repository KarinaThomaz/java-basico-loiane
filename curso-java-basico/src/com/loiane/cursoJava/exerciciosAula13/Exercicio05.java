package com.loiane.cursoJava.exerciciosAula13;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a metragem:");
        double metros = scan.nextDouble();

        double centimetros = metros*100;

        System.out.println(centimetros+"cm");
    }
}
