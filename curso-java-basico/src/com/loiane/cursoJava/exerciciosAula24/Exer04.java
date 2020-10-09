package com.loiane.cursoJava.exerciciosAula24;

import java.util.Date;

public class Exer04 {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.titulo = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.ano = 2015;
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoPara = "Karina";

        System.out.println("Titulo do livro: " + livro.titulo);

    }
}
