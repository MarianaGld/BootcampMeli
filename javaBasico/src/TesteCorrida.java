import java.util.ArrayList;
import java.util.Scanner;

public class TesteCorrida {
    public static void main(String[] args) {

        Scanner entr = new Scanner(System.in);
        System.out.println("Qual circuito deseja participar? \n 1 - Circuito Pequeno \n 2 - Circuito Medio \n 3 - Circuito Avancado ");

        int circuito = entr.nextInt();



        ArrayList<Participante> CircuitoPequeno = new ArrayList<>();
        CircuitoPequeno.add(new Participante("Mari Galdino", "34567890",
                "23457643", "O positivo", 30));





    }
}

