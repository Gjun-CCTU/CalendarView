package com.example.gjuncalendarview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    CalendarView calendar;
    TextView tv1;
    int mYear, mMonth, mDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendar = (CalendarView) findViewById(R.id.calendarView);
        tv1 = (TextView) findViewById(R.id.textView);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                mYear = year;
                mMonth = month + 1;
                mDay = dayOfMonth;
                tv1.setText("當前時間: " + mYear + "-" + mMonth + "-" + mDay );
            }
        });
    }
}
