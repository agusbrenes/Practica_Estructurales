package probema1;

public class LeafTag extends Tag {
    String value = "";

    public LeafTag(String openName, String closeName) {
        super(openName, closeName);
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean isCorrect() {
        return this.closeName.equals("/" + this.openName);
    }

}
