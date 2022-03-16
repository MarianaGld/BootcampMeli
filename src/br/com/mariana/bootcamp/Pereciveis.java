package br.com.mariana.bootcamp;

public class Pereciveis extends Produto {

    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer){
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return this.diasParaVencer;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }

    @Override
    public Double calcular(int quantidadeDeProdutos) {

        Double precoFinal = super.calcular(quantidadeDeProdutos);

        if (diasParaVencer == 1) {
           precoFinal = precoFinal/4;
        } else if (diasParaVencer == 2){
            precoFinal = precoFinal/3;
        } else if (diasParaVencer == 3){
            precoFinal = precoFinal/2;
        }

        return precoFinal;
    }
}
