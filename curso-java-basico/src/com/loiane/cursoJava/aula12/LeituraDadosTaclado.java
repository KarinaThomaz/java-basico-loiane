package com.loiane.cursoJava.aula12;

import java.util.Scanner;

public class LeituraDadosTaclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Digite seu nome completo:");
//        String nomeCompleto = scan.nextLine();
//        System.out.println("Seu nome completo é: " + nomeCompleto);
//
//        System.out.println("Digite seu primeiro nome:");
//        String primeiroNome = scan.next();
//        System.out.println("Seu primeiro nome é: " + primeiroNome);

//        System.out.println("Digite a sua idade:");
//        int idade = scan.nextInt();
//        System.out.println("Sua idade é: " + idade);
//
//        System.out.println("Digite a sua altura:");
//        double altura = scan.nextDouble();
//        System.out.println("A sua altura é: "+altura);

        System.out.println("Digite o seu primeiro nome, idade, qtde de filhos, altura e se tem pet:");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdeFilhos = scan.nextByte();
        double altura = scan.nextDouble();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome: "+ primeiroNome);
        System.out.println("Idade: "+ idade);
        System.out.println("Quantidade de filhos: "+ qtdeFilhos);
        System.out.println("Altura: "+ altura);
        System.out.println("Tem bichinho de estimação? "+ temPet);
    }
}