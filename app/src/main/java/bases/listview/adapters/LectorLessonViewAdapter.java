package bases.listview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import bases.schedule_clases.pack.Lesson;
import bases.schedule_clases.pack.LessonForLector;

import java.util.ArrayList;

import uni.franko.com.uniplaner_v01b.R;

/**
 * Created by Pupkin on 14.11.2015.
 */
public class LectorLessonViewAdapter extends BaseAdapter {
    private ArrayList<Lesson> lessonslist;
    private Context context;
    private LayoutInflater inflater;

    public LectorLessonViewAdapter(ArrayList<Lesson> lessonslist, Context context) {
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
        String value_group_or_lect;
        if(someview==null)
        {
            someview=inflater.inflate(R.layout.lesson_view,parent,false);
        }
        LessonForLector less = getStudLess(position);
        //set number
        TextView number = (TextView)someview.findViewById(R.id.number);
        number.setText(less.getNumber());
        //setgroupname
        TextView groupname = (TextView)someview.findViewById(R.id.lect_or_group_name);
        number.setText(less.getGroupname());
        //set name
        TextView lessname = (TextView)someview.findViewById(R.id.lesson_name);
        lessname.setText(less.getName());
        //set audience
        TextView audience = (TextView)someview.findViewById(R.id.audience);
        audience.setText(less.getAudience());
        //type of lesson set
        TextView typeofless = (TextView)someview.findViewById(R.id.number);
        number.setText(less.getLesson_type());
        /******time set !!!rewrite this later!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
        TextView lesstime = (TextView)someview.findViewById(R.id.time);
        lesstime.setText(less.getNumber());


        return someview;
    }
    private LessonForLector getStudLess(int pos)
    {
        return (LessonForLector)getItem(pos);
    }

}
