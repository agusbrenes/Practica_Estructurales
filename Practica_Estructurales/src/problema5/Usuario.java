package problema5;

public class Usuario {
    private boolean privileges;
    private IProcess process;
    
    public Usuario(boolean privileges, IProcess process) {
        this.privileges = privileges;
        this.process = process;
    }
    
    public void setPrivileges(boolean privileges) {
        this.privileges = privileges;
    }
    
    public boolean getPrivileges() {
        return this.privileges;
    }
    
    public void callOp() { 
        process.execute(privileges);
    }
}
