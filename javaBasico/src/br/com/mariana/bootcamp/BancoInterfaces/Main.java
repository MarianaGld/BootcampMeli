package br.com.mariana.bootcamp.BancoInterfaces;

public class Main {
    public static void main(String[] args) {
        Executivo exe = new Executivo();
        System.out.println("Executivo  -----------");
        exe.depositar();
        exe.transacaoOk("deposito");
        exe.transferir();
        exe.transacaoNaoOk("transferencia");

        Basico basico = new Basico();

        System.out.println("\n Basico  -----------");
        basico.consultarSaldo();
        basico.transacaoOk("consultar saldo");
        basico.pagar();
        basico.sacar();
        basico.transacaoNaoOk("saque");

        Cobradores cobrador = new Cobradores();
        System.out.println("\n Cobrador  -----------");
        cobrador.consultarSaldo();
        cobrador.transacaoOk("consultar saldo");
        cobrador.sacar();
        cobrador.transacaoNaoOk("saque");



    }
}
