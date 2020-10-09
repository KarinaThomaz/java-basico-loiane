package com.loiane.cursoJava.exerciciosAula13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor/hora:");
        double valorHora = scan.nextDouble();
        System.out.println("Entre com a qtde de horas trabalhadas no mês:");
        double horas = scan.nextDouble();
        double salarioBruto = valorHora*horas;
        System.out.println(salarioBruto);

        double inss = (salarioBruto/100)*8;
        System.out.println(inss);

        double sindicato = (salarioBruto/100)*5;
        System.out.println(sindicato);

        double ir = (salarioBruto/100)*11;
        System.out.println(ir);

        double totalDescontos = inss+sindicato+ir;
        System.out.println(totalDescontos);

        double salarioLiquido = salarioBruto-totalDescontos;
        System.out.println(salarioLiquido);
    }
}
