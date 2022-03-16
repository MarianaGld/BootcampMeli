package br.com.mariana.bootcamp.print;

public class Test {
    public static void main(String[] args) {


        Curriculo curriculo = new Curriculo("Mari Galdino", 29, "ADS", "comunicacao");
        curriculo.print(curriculo);
        System.out.println("-----------------");

        Livro livro = new Livro("Mari", "E o mar levou", "drama", 250);
        livro.print(livro);
        System.out.println("-----------------");

        Relatorio rel = new Relatorio("Mari", "Mauri", 5);
        rel.print(rel);


    }
}