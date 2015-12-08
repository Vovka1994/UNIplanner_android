package uni.franko.com.uniplaner_v01b;

import bases.schedule_clases.*;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import bases.listview.adapters.StudentLessonViewAdapter;
import bases.schedule_clases.pack.LessonForStudent;
import bases.schedule_clases.pack.Schedule;
import bases.schedule_clases.pack.ScheduleFromXml;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.support.v4.view.ViewPager;

import com.test.pak.MyAdapter;

public class MainActivity extends ActionBarActivity {

    public byte param;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Schedule schedule = ScheduleFromXml.ReadSchedule(R.xml.pmp51s,this,);
       // ViewPager pager=(ViewPager)findViewById(R.id.pager);
       // pager.setAdapter(new MyAdapter(this,getSupportFragmentManager(),schedule.getStudydays()));

    }
    public void ClickAll(View v)
    {
        param=2;
        Intent intent = new Intent(this,Activity2.class);
        intent.putExtra("param",param);//передача даних між актівіті
        startActivity(intent);

    }
    public void ClickChis(View view)
    {
        param=0;
        Intent intent = new Intent(MainActivity.this,Activity2.class);

        intent.putExtra("param",param);//передача даних між актівіті
        startActivity(intent);

    }
    public void ClickZnam(View view)
    {
        param=1;
        Intent intent = new Intent(MainActivity.this,Activity2.class);

        intent.putExtra("param",param);//передача даних між актівіті
        startActivity(intent);

    }
}
