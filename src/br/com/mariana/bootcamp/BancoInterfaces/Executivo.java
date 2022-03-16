package br.com.mariana.bootcamp.BancoInterfaces;


public class Executivo  implements Deposito, Transferencia {


    @Override
    public void depositar() {
        System.out.println("Fazendo um deposito, valor R$: ");
    }

    @Override
    public void transferir() {
        System.out.println("Transferindo, valor R$: ");
    }

    @Override
    public void transacaoOk(String transacao) {
        System.out.println("Transacao " + transacao + " efetuada com sucesso");
    }

    @Override
    public void transacaoNaoOk(String transacao) {
        System.out.println("Transacao " + transacao + " nao efetuada");
    }
}
