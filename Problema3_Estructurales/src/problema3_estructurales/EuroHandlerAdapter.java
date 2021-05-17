package problema3_estructurales;

public class EuroHandlerAdapter extends CashHandler {
    
    private EuroHandler euroHandler;
    private final double tipoCambio = 747.92d;
    
    public EuroHandlerAdapter(){
        super();
        euroHandler = new EuroHandler();
    }

    @Override
    public void processColones(double amount) {
        euroHandler.processEuros(amount);
        double colones = amount * tipoCambio;
        System.out.println(colones + " colones han sido depositados!");
    }

}
