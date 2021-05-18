package probema1;

public abstract class Tag {
    protected String openName;
    protected String closeName;

    public Tag(String openName, String closeName) {
        //super();
        this.openName = openName;
        this.closeName = closeName;
    }
    
    public boolean equals(String openName, String closeName) {
        return this.openName.equals(openName) && this.closeName.equals(closeName); 
    }
    
    public abstract boolean isCorrect();

}
