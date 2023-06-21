public class Produto {
    
    static double pastelPreço = 5.50;
    static double cafePreço = 2.10;
    static double xisPreço = 15.99;
    static double pizzaPreço = 20.75;

    public static void main(String[] args) {
    } 


    
    public static void produtos() {
        System.out.println("*** LISTA DE PRODUTOS ***");
        System.out.println("┌──────────────────────────┐");
        System.out.println("│ Pastel de Carne: " + pastelPreço + "     │");
        System.out.println("├──────────────────────────┤");
        System.out.println("│ Café: " + cafePreço + "                │");
        System.out.println("├──────────────────────────┤");
        System.out.println("│ Xis de Carne: " + xisPreço + "      │");
        System.out.println("├──────────────────────────┤");
        System.out.println("│ Pizza de Frango: " + pizzaPreço + "   │");
        System.out.println("└──────────────────────────┘");
    }
    
}