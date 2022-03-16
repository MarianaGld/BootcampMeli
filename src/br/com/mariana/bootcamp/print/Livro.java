package br.com.mariana.bootcamp.print;

public class Livro implements Documento {

    private String autor;
    private String titulo;
    private String genero;
    private int numPaginas;

    public Livro(String autor, String titulo, String genero, int numPaginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return "livro{ " +
                "autor= " + autor + '\'' +
                " titulo= " + titulo + '\'' +
                " genero= " + genero + '\'' +
                " numPaginas= " + numPaginas +
                '}';
    }

    @Override
    public void print(Documento o) {
        System.out.println(o.toString());
    }
}
