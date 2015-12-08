package bases.schedule_clases.pack;

/**
 * Created by Pupkin on 13.11.2015.
 */
public class Group {
    private String name_group;
    //...//

    private Group(String name_group) {
        this.name_group = name_group;
    }

    public static Group newGroup(String name_group) {
        return new Group(name_group);
    }

    public String getName_group() {
        return name_group;
    }

    public void setName_group(String name_group) {
        this.name_group = name_group;
    }
}
