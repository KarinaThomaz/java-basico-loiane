package com.loiane.cursoJava.aula17;

public class LoopFor {
    public static void main(String[] args) {
//        for(int i=0;i<5;i++){
//            System.out.println(i);
//        }
//
//        for(int i=5; i>0;i--){
//            System.out.println(i);
//        }

//        for(int i=0, j=10; i<j; i++, j--){
//            System.out.println("i = " + i + " j = " + j);
//        }

        int soma = 0;
        for (int i = 0; i < 5; soma += i++);
        System.out.println("Soma: "+soma);

        for(int i=0;i<5;i++)
            System.out.println(i);
    }
}
