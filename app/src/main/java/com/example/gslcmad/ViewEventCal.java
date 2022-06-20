package com.example.gslcmad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class ViewEventCal extends AppCompatActivity {


    CalendarView cv;
    TextView tvdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_event_cal);
        cv = (CalendarView) findViewById(R.id.calendar);
        tvdate = (TextView) findViewById(R.id.tvtgl);

        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1 + 1) + "/" + i2 + "/" + i;
                tvdate.setText(date);
            }
        });
    }
}