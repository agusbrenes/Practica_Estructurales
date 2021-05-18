package probema1;

import java.util.ArrayList;

public class CompositeTag extends Tag {
    
    // agregar children, varios tags
    ArrayList<Tag> subTags;

    public CompositeTag(String openName, String closeName) {
        super(openName, closeName);
        subTags = new ArrayList<>();
    }
    
    public void addTag(Tag tag) {
        subTags.add(tag);
    }
    
    public Tag removeTag(String openName, String closeName) {      
        for(int i = 0; i < subTags.size(); i++){
            if(subTags.get(i).equals(openName, closeName)){
                return subTags.remove(i);
            }
        }
        throw new Error("SubTag <" + openName + "><" + closeName + "> does not exist inside <" + this.openName + "><" + this.closeName + ">");
    }
    
    public ArrayList<Tag> getSubTags() {
        return subTags;
    }

    @Override
    public boolean isCorrect() {
        boolean correctNames = this.closeName.equals("/" + this.openName);
        if (!correctNames) {
            return false;
        }
        
        for (Tag t: subTags) {
            if (!t.isCorrect()) {
                return false;
            }
        }
        return true;
    }

}
