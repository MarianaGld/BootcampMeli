package BancoInterfaces;

public class Main {
    public static void main(String[] args) {
        Executivo exe = new Executivo();

        exe.depositar();
        exe.transacaoOk("deposito");
    }
}
