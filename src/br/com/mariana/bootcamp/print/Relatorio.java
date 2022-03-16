package br.com.mariana.bootcamp.print;

public class Relatorio implements Documento{
    private String autor;
    private String revisor;
    private int numPaginas;


    public Relatorio(String autor, String revisor, int numPaginas) {
        this.autor = autor;
        this.revisor = revisor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return "Relatorio{ " +
                "autor= " + autor + '\'' +
                " revisor= " + revisor + '\'' +
                " numPaginas= " + numPaginas +
                '}';
    }

    @Override
    public void print(Documento o) {
        System.out.println(o.toString());
    }
}
