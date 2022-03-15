package ExeBootcamp;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa pessoaSemParam = new Pessoa();

        Pessoa pessoaAlgunsParam = new Pessoa("Mari", 29, "1234");

        Pessoa pessoaTodosParam = new Pessoa("Mari", 29, "1234", 65d, 165d);


        Double imc = pessoaTodosParam.calculoImc(65d, 1.65d);
        System.out.println("Seu imc eh de: " + imc);

        pessoaTodosParam.avaliacaoIMC(imc);

        boolean maiorIdade = pessoaTodosParam.ehMaiorIdade(29);
        if (maiorIdade) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você não é maior de idade");
        }

        System.out.println(pessoaTodosParam.toString());

    }
}