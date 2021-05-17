package problema5_estructurales;

import java.util.ArrayList;

public class Proxy implements IProcess {
    private ArrayList<String> audit;
    private RealProcess realProcess;
    
    public Proxy(RealProcess realProcess) {
        this.audit = new ArrayList();
        this.realProcess = realProcess;
    }
    
    @Override
    public void execute(boolean priv){
        if(priv) {
            realProcess.execute(priv);
            audit.add("Operation executed succesfully");
            System.out.println("Permission granted!");
        } else {
            audit.add("Operation denied, user doesn't have the privileges");
            System.out.println("Permission denied!");
        }
    }
    
    public String audit(){
        String s = "";
        for(int i = 0; i < audit.size(); i++) {
            s += "Entry " + i + ": " + audit.get(i) + "\n";
        }
        return s;
    }
}
