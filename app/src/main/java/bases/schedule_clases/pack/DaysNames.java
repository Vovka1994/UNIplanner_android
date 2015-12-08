package bases.schedule_clases.pack;

/**
 * Created by Pupkin on 13.11.2015.
 */
public class DaysNames {
    public static String GetDayNameByNumber(int number){
        String name;
        switch (number){
            case (1):{name="Понеділок";}break;
            case (2):{name="Вівторок";}break;
            case (3):{name="Середа";}break;
            case (4):{name="Четвер";}break;
            case (5):{name="Пятниця";}break;
            case (6):{name="Субота";}break;
            case (7):{name="Неділя";}break;
            default:{name="UnknownDayNumber!!!";}break;

        }

        return name;
    }
}
