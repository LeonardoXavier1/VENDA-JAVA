import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    Produto venda = new Produto(); 

    static double pastelPreço = 5.50;
    static double cafePreço = 2.10;
    static double xisPreço = 15.99;
    static double pizzaPreço = 20.75;

    public static void main(String[] args) throws InterruptedException{
        

        boolean vendendo = true;
        while(vendendo == true) {
            System.out.println("\n*** LOJA DE VENDA ***\n");
            Thread.sleep(1000);
            System.out.println("\n[ 1 ] Visualizar produtos.\n");
            System.out.println("[ 2 ] Sair.\n");
            String escolha = scanner.nextLine();

            switch(escolha){
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

    public static void Case1(String escolha1) throws InterruptedException{
        switch(escolha1){
            case "S":

            boolean comprando = true;
            while(comprando) {
                    System.out.println("*** LISTA DE PRODUTOS ***");
                    System.out.println("┌──────────────────────────┐");
                    System.out.println("│[1] Pastel de Carne: " + pastelPreço + "  │");
                    System.out.println("├──────────────────────────┤");
                    System.out.println("│[2] Café: " + cafePreço + "             │");
                    System.out.println("├──────────────────────────┤");
                    System.out.println("│[3] Xis de Carne: " + xisPreço + "   │");
                    System.out.println("├──────────────────────────┤");
                    System.out.println("│[4] Pizza de Frango: " + pizzaPreço + "│");
                    System.out.println("└──────────────────────────┘");

                    System.out.print("Escolha o produto que você deseja:");
                    System.out.print("Escolha a quantidade:");
                    String a = scanner.nextLine();
                    Case2(a);       
            }

            break;

            case "s":
            System.out.println("Responda de acordo com a opção fornecida.");
            return;

            case "N":
                Acoes.Encerra();
                break;

            case "n":
            System.out.println("Responda de acordo com a opção fornecida.");
            return;
        }
    }

    
    public static void Case2(String a){
        switch(a){
            case "1":
            System.out.println("pastel");
            break;
        }
    }
}
