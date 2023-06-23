import java.util.HashMap;
import java.util.Map;

public class Carrinho {
    private HashMap<String, Integer> escolhas;

    public Carrinho() {
        escolhas = new HashMap<>();
    }

    public void adicionarProduto(String escolhaProduto, int quantidade) {
        escolhas.put(escolhaProduto, quantidade);
    }

    public void mostrarResumoCompra(double pastelPreco, double cafePreco, double xisPreco, double pizzaPreco) {
        double valorTotalCompra = 0.0;

        System.out.println("\nResumo da compra:");
        for (Map.Entry<String, Integer> entry : escolhas.entrySet()) {
            String escolhaProduto = entry.getKey();
            int quantidade = entry.getValue();
            String produto = "";

            switch (escolhaProduto) {
                case "1":
                    produto = "Pastel de Carne";
                    valorTotalCompra += pastelPreco * quantidade;
                    break;
                case "2":
                    produto = "Café";
                    valorTotalCompra += cafePreco * quantidade;
                    break;
                case "3":
                    produto = "Xis de Carne";
                    valorTotalCompra += xisPreco * quantidade;
                    break;
                case "4":
                    produto = "Pizza de Frango";
                    valorTotalCompra += pizzaPreco * quantidade;
                    break;
            }

            System.out.println(produto + " - Quantidade: " + quantidade);
        }

        System.out.println("Valor Total da Compra: R$" + valorTotalCompra);
        
    }
}
