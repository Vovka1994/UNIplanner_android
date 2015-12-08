package bases.schedule_clases.pack;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Pupkin on 13.11.2015.
 */
public class SomeUniDay {
    private int daynumber;
    private ArrayList<Lesson> lessonArrayList;

    public SomeUniDay() {
        lessonArrayList = new ArrayList<Lesson>();
    }

    public void AddLessonToday(Lesson somelesson){
        lessonArrayList.add(somelesson);
    }

    public ArrayList<Lesson> getLessonArrayList() {
        return lessonArrayList;
    }

    public void setDaynumber(int daynumber) {
        this.daynumber = daynumber;
    }

    public int getDaynumber() {
        return daynumber;
    }
}
