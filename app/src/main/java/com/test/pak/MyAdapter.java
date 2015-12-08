package com.test.pak;

/**
 * Created by Pupkin on 15.11.2015.
 */
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

import bases.schedule_clases.pack.DaysNames;
import bases.schedule_clases.pack.Lesson;
import bases.schedule_clases.pack.LessonForStudent;
import bases.schedule_clases.pack.SomeUniDay;

public class MyAdapter extends FragmentPagerAdapter {
    Context ctxt=null;
    ArrayList<SomeUniDay> arrayList=null;
    public MyAdapter(Context ctxt, FragmentManager mgr,ArrayList<SomeUniDay> arrayList) {
        super(mgr);
        this.ctxt=ctxt;
        //arrayList.remove(2);
        this.arrayList=arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }
    @Override
    public Fragment getItem(int position) {
        SomeUniDay someday = arrayList.get(position);
        PageFragment currentfragment = PageFragment.newInstance(DaysNames.GetDayNameByNumber(someday.getDaynumber()));
        currentfragment.setSomeday(someday);
        currentfragment.setContext(ctxt);
        return(currentfragment);
    }
    @Override
    public String getPageTitle(int position) {
        return(PageFragment.getTitle(ctxt,position, arrayList.get(position)));
    }
}
