package bases.schedule_clases.pack;

/**
 * Created by Pupkin on 13.11.2015.
 */
public class LessonForStudent extends Lesson {
    private Lector somelector;
    public LessonForStudent(){
        super();
        somelector = new Lector();
    }

    public String getLectorname() {
        return somelector.getLectors_name();
    }

    public void setLectorname(String lectorname) {
        somelector.setLectors_name(lectorname);
    }

    @Override
    public String toString() {
        return "LessonForStudent{" +
        "number=" + number +
                ", name='" + name + '\'' +
                ", audience='" + audience + '\'' +
                ", znamennik=" + weekType +
                ", lesson_type='" + lesson_type + '\'' +
                "somelector=" + somelector +
                '}';
    }
}
