public class Participante {

    public String nomeCompleto;
    public String numCelular;
    public String numEmergencia;
    public String grupoSanguineo;
    public int idade;

    public Participante(String nomeCompleto, String numCelular, String numEmergencia, String grupoSanguineo, int idade) {
        this.nomeCompleto = nomeCompleto;
        this.numCelular = numCelular;
        this.numEmergencia = numEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.idade = idade;

    }

    public void ValorInscricao(int idade) {
        if (idade < 18) {
            System.out.println("Voce deve pagar: \n 1 - Circuito Pequeno R$1300 \n 2 - Circuito Medio R$2000 \n");
        } else {
            System.out.println("Voce deve pagar: \n 1 - Circuito Pequeno R$1500 \n 2 - Circuito Medio R$2300 \n 3 - Circuito Avancado R$2800");
        }
    }
}
