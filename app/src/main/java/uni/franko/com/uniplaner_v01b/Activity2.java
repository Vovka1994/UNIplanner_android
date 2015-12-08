package uni.franko.com.uniplaner_v01b;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.test.pak.MyAdapter;

import bases.schedule_clases.pack.Schedule;
import bases.schedule_clases.pack.ScheduleFromXml;

public class Activity2 extends ActionBarActivity {
    public byte params=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        params=getIntent().getExtras().getByte("param");
        setContentView(R.layout.test_viewpager);
         Schedule schedule = ScheduleFromXml.ReadSchedule(R.xml.pmp51s, this,params );
         ViewPager pager=(ViewPager)findViewById(R.id.pager);
         pager.setAdapter(new MyAdapter(this,getSupportFragmentManager(),schedule.getStudydays()));

    }
}
