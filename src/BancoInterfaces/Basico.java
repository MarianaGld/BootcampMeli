package BancoInterfaces;

public class Basico implements Saldo, PagamentoServico, Saque{
    @Override
    public void consultarSaldo() {
        System.out.println("Consulta de saldo realizada");
    }

    @Override
    public void sacar() {
        System.out.println("Saque realizado");
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado");
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
