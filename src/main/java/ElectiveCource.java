import java.util.List;

public class ElectiveCource implements Cource{
    private List<Subject> subjects;

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public void getCource() {
        System.out.println("This is elective cource");
        for(Subject s: subjects){
            s.showNameAndHours();
        }
    }
}