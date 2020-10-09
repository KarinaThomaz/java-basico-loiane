package com.loiane.cursoJava.exerciciosAula24;

public class Exer03 {
    public static void main(String[] args) {
        LivroDeLivraria livro = new LivroDeLivraria();

        livro.titulo = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.ano = 2015;
        livro.valor = 63.39;

        System.out.println("Titulo do livro: " + livro.titulo);

    }
}
