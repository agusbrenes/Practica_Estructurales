package problema5_estructurales;

public class Problema5_Estructurales {
    public static void main(String[] args) {
        RealProcess real = new RealProcess();
        Proxy proxy = new Proxy(real);
        
        Usuario userPrivileged = new Usuario(true, proxy);
        Usuario userForbidden = new Usuario(false, proxy);
        
        userPrivileged.callOp();
        userForbidden.callOp();
        userPrivileged.callOp();
        userPrivileged.callOp();
        userForbidden.callOp();
        
        System.out.println(proxy.audit());
    } 
}
