package ExeBootcamp;

public class TestaProduto {
    public static void main(String[] args) {

//        Produto mousePad = new Produto("MousePad ", 50.5);
//
//        Double precoFinal = mousePad.calcular(10);
//
//        System.out.println("O valor final da compra é R$ " + precoFinal);

        Pereciveis arroz = new Pereciveis("Camil",10.0,0);

        Double precoFinal2 = arroz.calcular(1);

        System.out.println(" preco final do arroz " + precoFinal2);

    }

}
