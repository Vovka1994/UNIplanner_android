package bases.schedule_clases.pack;

import android.content.Context;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

/**
 * Created by Pupkin on 13.11.2015.
 */
public class ScheduleFromXml {

    public static Schedule ReadSchedule(Integer resname, Context context,byte chisznam) {
        Schedule scheduleres = null;
        int daynumber=0;
        SomeUniDay dayforadd = null;
        try {
            XmlPullParser parser = context.getResources().getXml(resname);

            {
                scheduleres = new Schedule();
                LessonForStudent lessonforadd = new LessonForStudent();
                while (parser.getEventType() != XmlPullParser.END_DOCUMENT) {
                    if (parser.getEventType() == XmlPullParser.START_TAG && parser.getName().equals("day")) {
                        daynumber = Byte.valueOf(parser.getAttributeValue(0));
                        dayforadd = new SomeUniDay();
                        dayforadd.setDaynumber(daynumber);
                    }
                    if (parser.getEventType() == XmlPullParser.END_TAG && parser.getName().equals("day")) {
                        scheduleres.AddDayToSchedule(dayforadd);
                    }
                    if ((parser.getEventType() == XmlPullParser.START_TAG && parser.getName().equals("lesson"))) {
                        /*number=""
                        name=""
                        audience=""
                        znamennik=""
                        lector=""
                        typeof=""
                        */

                        if((Byte.valueOf(parser.getAttributeValue(3)))==2||((chisznam==2)||(Byte.valueOf(parser.getAttributeValue(3))==chisznam))) {
                            lessonforadd = new LessonForStudent();
                            lessonforadd.setNumber(Byte.valueOf(parser.getAttributeValue(0)));
                            lessonforadd.setName(parser.getAttributeValue(1));
                            lessonforadd.setAudience(parser.getAttributeValue(2));
                            lessonforadd.setZnamennik(Byte.valueOf(parser.getAttributeValue(3)));
                            lessonforadd.setLectorname(parser.getAttributeValue(4));
                            lessonforadd.setLesson_type(TypeOfLesson.TypeOfLesson(Byte.valueOf(parser.getAttributeValue(5))));
                            dayforadd.AddLessonToday(lessonforadd);
                        }
                    }
                    parser.next();
                }
                return scheduleres;
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return scheduleres;
    }
}

