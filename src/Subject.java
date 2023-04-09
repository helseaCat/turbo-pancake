import java.util.ArrayList;

/**
 * Subject should have 8 hard coded subjects.
 **/
public class Subject{

    private String moduleName;
    private int moduleId;
    private ArrayList<BaseFlashCard> cards = new ArrayList<>();

    public Subject() {
    }

    public Subject(String moduleName, int moduleId, ArrayList<BaseFlashCard> cards){
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        this.cards = cards;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public ArrayList<BaseFlashCard> getCards() {
        return cards;
    }

    public void setCards(ArrayList<BaseFlashCard> cards) {
        this.cards = cards;
    }
}