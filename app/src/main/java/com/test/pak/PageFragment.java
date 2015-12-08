package com.test.pak;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import bases.listview.adapters.StudentLessonViewAdapter;
import bases.schedule_clases.pack.DaysNames;
import bases.schedule_clases.pack.Lesson;
import bases.schedule_clases.pack.SomeUniDay;
import uni.franko.com.uniplaner_v01b.R;



public class PageFragment extends Fragment {


    private SomeUniDay someday=null;
    private Context contx;
    private static String pagename="";

    public static PageFragment newInstance(String name) {
        PageFragment fragment = new PageFragment();
        Bundle args=new Bundle();
        args.putString("name", name);
        fragment.setArguments(args);
        return fragment;
    }

    public void setSomeday(SomeUniDay someday) {
        this.someday = someday;
    }

    public void setContext(Context contx) {
        this.contx = contx;
    }

    public PageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            pagename =getArguments().getString("name");
        }
        catch (Exception ex){pagename=ex.toString();}

    }
    static String getTitle(Context ctxt, int position,SomeUniDay day) {
        return DaysNames.GetDayNameByNumber(day.getDaynumber());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        StudentLessonViewAdapter adapter = new StudentLessonViewAdapter(someday.getLessonArrayList(),contx);
        View result=inflater.inflate(R.layout.test_layout1, container, false);
        ListView listv=(ListView)result.findViewById(R.id.listViewpager);
        listv.setAdapter(adapter);
        return result;
    }
}
