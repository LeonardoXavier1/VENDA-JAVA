import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
  //  private static Produto venda = new Produto();

    static double pastelPreco = 5.50;
    static double cafePreco = 2.10;
    static double xisPreco = 15.99;
    static double pizzaPreco = 20.75;

    public static void main(String[] args) throws InterruptedException {
        boolean vendendo = true;
        while (vendendo) {
            System.out.println("\n*** LOJA DE VENDA ***\n");
            Thread.sleep(1000);
            System.out.println("\n[ 1 ] Visualizar produtos.\n");
            System.out.println("[ 2 ] Sair.\n");
            String escolha = scanner.nextLine();
            
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatadaInicial = dataHoraAtual.format(formatter);
        System.out.println("┌─────────────────────────────────────────────────────────┐");
        System.out.println("│Data e Hora do início Compra: "+dataHoraFormatadaInicial+"        │");
        System.out.println("└─────────────────────────────────────────────────────────┘");



            switch (escolha) {
                case "1":
                    Produto.produtos();

                    System.out.println("\nGostaria de comprar? S/N\n");
                    String escolha1 = scanner.nextLine();
                    Case1(escolha1);
                    break;

                case "2":
                    vendendo = false;
                    Acoes.Encerra();
                    break;

                default:
                    System.out.println("Opção inválida, por favor tente novamente.");
                    break;
            }

        }
    }

    public static void Case1(String escolha1) throws InterruptedException {
        switch (escolha1) {
            case "S":
            case "s":
                boolean comprando = true;
                Carrinho carrinho = new Carrinho();

                while (comprando) {
                    System.out.println("\n*** LISTA DE PRODUTOS ***\n");
                    System.out.println("┌──────────────────────────┐");
                    System.out.println("│[1] Pastel de Carne: " + pastelPreco + "  │");
                    System.out.println("├──────────────────────────┤");
                    System.out.println("│[2] Café: " + cafePreco + "             │");
                    System.out.println("├──────────────────────────┤");
                    System.out.println("│[3] Xis de Carne: " + xisPreco + "   │");
                    System.out.println("├──────────────────────────┤");
                    System.out.println("│[4] Pizza de Frango: " + pizzaPreco + "│");
                    System.out.println("└──────────────────────────┘");

                    System.out.print("Escolha o produto que você deseja:");
                    String escolhaProduto = scanner.nextLine();
                    System.out.print("Escolha a quantidade:");
                    String escolhaQuantidade = scanner.nextLine();

                    carrinho.adicionarProduto(escolhaProduto, Integer.parseInt(escolhaQuantidade));

                    System.out.print("\nDeseja adicionar mais produtos? S/N\n");
                    String resposta = scanner.nextLine();
                    if (resposta.equalsIgnoreCase("N")) {
                        comprando = false;
                    }
                }

                Case2(carrinho);
                break;

            case "N":
            case "n":
                comprando = false;
                return;
        }
    }

    
        public static void Case2(Carrinho carrinho) throws InterruptedException  {
        carrinho.mostrarResumoCompra(pastelPreco, cafePreco, xisPreco, pizzaPreco);

        System.out.println("\n*** FORMAS DE PAGAMENTO ***");
        System.out.println("┌──────────────────────────┐");
        System.out.println("│[1] Débito.               │");
        System.out.println("├──────────────────────────┤");
        System.out.println("│[2] Crédito.              │");
        System.out.println("├──────────────────────────┤");
        System.out.println("│[3] Pix.                  │");
        System.out.println("├──────────────────────────┤");
        System.out.println("│[4] Dinheiro.             │");
        System.out.println("└──────────────────────────┘");

        System.out.print("Escolha a forma de pagamento:");
        String formaPagamento = scanner.nextLine();

        LocalDateTime dataHoraFinal = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatadaFinal = dataHoraFinal.format(formatter);


        System.out.println("┌─────────────────────────────────────────────────────────┐");
        System.out.println("│Data e Hora do final Compra: "+dataHoraFormatadaFinal+"         │");
        System.out.println("│Forma de Pagamento: " + formaPagamento + "                                    │");
        System.out.println("└─────────────────────────────────────────────────────────┘");
        
        System.out.println("┌──────────────────────────┐");
        System.out.println("│ Obrigado por Comprar.    │");
        System.out.println("└──────────────────────────┘");
    }
    }