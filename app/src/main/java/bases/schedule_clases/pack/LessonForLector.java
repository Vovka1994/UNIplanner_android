package bases.schedule_clases.pack;

/**
 * Created by Pupkin on 12.11.2015.
 */
public class LessonForLector extends Lesson {
    private Group groupname;
    public LessonForLector(){};
    public LessonForLector(String groupname) {
        super();
        this.groupname = Group.newGroup(groupname);
    }


    public void setGroupname(String groupname) {
        this.groupname.setName_group(groupname);
    }

    public String getGroupname() {
        return groupname.getName_group();
    }

    @Override
    public String toString() {
        return "LessonForLector{" +
        "number=" + number +
                ", name='" + name + '\'' +
                ", audience='" + audience + '\'' +
                ", znamennik=" + weekType +
                ", lesson_type='" + lesson_type + '\'' +
                "groupname=" + groupname +
                '}';
    }
}
