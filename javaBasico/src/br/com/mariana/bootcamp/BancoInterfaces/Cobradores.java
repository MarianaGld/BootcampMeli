package br.com.mariana.bootcamp.BancoInterfaces;

public class Cobradores implements Saque, Saldo{
    @Override
    public void consultarSaldo() {
        System.out.println("Consulta de saldo realizada");
    }

    @Override
    public void sacar() {
        System.out.println("Saque realizado com sucesso");
    }

    @Override
    public void transacaoOk(String transacao) {
        System.out.println("transacao " + transacao + " realizada");
    }

    @Override
    public void transacaoNaoOk(String transacao) {
        System.out.println("transacao " + transacao + " nao realizada");
    }
}
