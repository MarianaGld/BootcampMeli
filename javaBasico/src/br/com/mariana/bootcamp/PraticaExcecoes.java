package br.com.mariana.bootcamp;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a= 0;
        int b = 300;


        try {
            int resultado = b / a;
        } catch (ArithmeticException e){
            System.out.println("Ocorreu um erro");
        }finally {
            System.out.println("Programa finalizado.");
        }

        


    }



}
