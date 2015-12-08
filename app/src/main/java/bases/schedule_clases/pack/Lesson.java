package bases.schedule_clases.pack;

/**
 * Created by Pupkin on 12.11.2015.
 */
public abstract class Lesson {
    protected byte number;
    protected String name;
    protected String audience;
    protected byte weekType;  //true - para po znamennuky
    protected String lesson_type;

    public Lesson(){}
    public Lesson(byte number, String name, String audience, byte znamennik,String typeOfLesson) {
        this.number = number;
        this.name = name;
        this.audience = audience;
        this.weekType = znamennik;
        this.lesson_type = typeOfLesson;
    }

    public byte getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getAudience() {
        return audience;
    }

    public byte getWeekType() {
        return weekType;
    }

    public void setNumber(byte number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public void setZnamennik(byte znamennik) {
        this.weekType = znamennik;
    }

    public void setLesson_type(String lesson_type) {
        this.lesson_type = lesson_type;
    }

    public String getLesson_type() {
        return lesson_type;
    }

    @Override
    public  String toString() {
        return "Lesson{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", audience='" + audience + '\'' +
                ", znamennik=" + weekType +
                ", lesson_type='" + lesson_type + '\'' +
                '}';
    }
}
