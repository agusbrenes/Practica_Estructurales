package problema5_estructurales;

public class RealProcess implements IProcess{
    public RealProcess() {}
    
   @Override
   public void execute(boolean priv) {
       System.out.println("Executing...");
       System.out.println("Executed!");
   }
}
