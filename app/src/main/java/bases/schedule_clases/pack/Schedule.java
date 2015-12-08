package bases.schedule_clases.pack;

import java.util.ArrayList;

/**
 * Created by Pupkin on 13.11.2015.
 */
public class Schedule {
    private ArrayList<SomeUniDay> studydays;
    public Schedule()
    {
        studydays = new ArrayList<SomeUniDay>();
    }
    public Schedule(ArrayList<SomeUniDay> studydays) {
        this.studydays = studydays;
    }

    public ArrayList<SomeUniDay> getStudydays() {
        return studydays;
    }

    public void AddDayToSchedule(SomeUniDay someDay)
    {
        this.studydays.add(someDay);
    }
}
