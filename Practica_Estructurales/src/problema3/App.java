package problema3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        CashHandler handler;
        Scanner scan = new Scanner(System.in); 
        
        System.out.println("1. Dolares\n2. Euros\n3. Colones\nDigite el tipo de moneda que desea para la transacción: ");
        int type = scan.nextInt();
        switch (type) {
            case 1 -> handler = new DollarHandlerAdapter();
            case 2 -> handler = new EuroHandlerAdapter();
            case 3 -> handler = new CashHandler() {};
            default -> {
                handler = null;
                System.out.println("Tipo de moneda incorrecta. Cerrando programa...");
                System.exit(0);
            }            
        }
        
        System.out.println("Introduzca la cantidad que desea depositar: ");
        double amount = scan.nextDouble();
        
        handler.processColones(amount);       
        
    }

}
