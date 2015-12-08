package bases.listview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import bases.schedule_clases.pack.Lesson;
import bases.schedule_clases.pack.LessonForStudent;

import java.util.ArrayList;

import uni.franko.com.uniplaner_v01b.R;

/**
 * Created by Pupkin on 14.11.2015.
 */
public class StudentLessonViewAdapter extends BaseAdapter {
    private ArrayList<Lesson> lessonslist;
    private Context context;
    private LayoutInflater inflater;

    public StudentLessonViewAdapter(ArrayList<Lesson> lessonslist, Context context) {
        this.lessonslist = lessonslist;
        this.context = context;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return lessonslist.size();
    }

    @Override
    public Object getItem(int position) {
        return lessonslist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View someview = convertView;

        if(someview==null)
        {
            someview=inflater.inflate(R.layout.lesson_view,parent,false);
        }
        LessonForStudent less = getStudLess(position);
        //set number
        try {
            TextView number = (TextView) someview.findViewById(R.id.number);
            number.setText(Byte.toString(less.getNumber()));
        }
        catch (Exception ex){

        }
        //setlector
        TextView lector = (TextView)someview.findViewById(R.id.lect_or_group_name);
        lector.setText(less.getLectorname());
        //set name
        TextView lessname = (TextView)someview.findViewById(R.id.lesson_name);
        lessname.setText(less.getName());
        //set audience
        TextView audience = (TextView)someview.findViewById(R.id.audience);
        audience.setText(less.getAudience());
        //type of lesson set
        TextView typeofless = (TextView)someview.findViewById(R.id.typeoflesson);
        typeofless.setText(less.getLesson_type());
        /******time set !!!rewrite this later!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
        TextView lesstime = (TextView)someview.findViewById(R.id.time);
        lesstime.setText("8:30");


        return someview;
    }
    private LessonForStudent getStudLess(int pos)
    {
        return (LessonForStudent)getItem(pos);
    }

}
