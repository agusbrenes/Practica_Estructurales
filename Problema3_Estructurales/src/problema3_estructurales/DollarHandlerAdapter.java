package problema3_estructurales;

public class DollarHandlerAdapter extends CashHandler {

    private DollarHandler dollarHandler;
    private final double tipoCambio = 615.43d;
    
    public DollarHandlerAdapter() {
        super();
        dollarHandler = new DollarHandler();
    }

    @Override
    public void processColones(double amount) {
        dollarHandler.processDollars(amount);
        double colones = amount * tipoCambio;
        System.out.println(colones + " colones han sido depositados!");
    }

}
