import java.util.ArrayList;

public class Subject{

    private String moduleName;
    private int moduleId;
    private ArrayList<Object> questions = new ArrayList<>();

    public Subject(String moduleName, int moduleId, ArrayList<Object> questions){
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        this.questions = questions;
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

    public ArrayList<Object> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Object> questions) {
        this.questions = questions;
    }
}