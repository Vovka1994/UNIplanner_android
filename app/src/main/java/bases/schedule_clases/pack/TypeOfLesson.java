package bases.schedule_clases.pack;

/**
 * Created by Pupkin on 13.11.2015.
 */
public class TypeOfLesson {
    private static final String lection ="Лекція";
    private static final String pract="Практична";
    private static final String seminar="Семінар";
    public static String TypeOfLesson(byte type){
        switch (type)
        {
            case (0):return lection;
            case (1):return pract;
            case (2):return seminar;
            default:return "null";
        }
    }
}
