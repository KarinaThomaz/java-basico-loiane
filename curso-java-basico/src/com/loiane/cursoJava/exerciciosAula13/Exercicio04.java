package com.loiane.cursoJava.exerciciosAula13;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota bimestral:");
        double n1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota bimestral:");
        double n2 = scan.nextDouble();

        System.out.println("Entre com a terceira nota bimestral:");
        double n3 = scan.nextDouble();

        System.out.println("Entre com a quarta nota bimestral:");
        double n4 = scan.nextDouble();

        double media = (n1+n2+n3+n4)/4;
        System.out.println("Média: "+media);
    }
}
