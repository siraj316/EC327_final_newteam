package com.example.aziz.runschedule;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.Calendar;

public class Your_goal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_goal);


        Button b = (Button) findViewById(R.id.Button_to_home);
        b.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {

                String fname= getIntent().getStringExtra("user-fname");
                String lname= getIntent().getStringExtra("user-lname");
                String sex= getIntent().getStringExtra("user-sex");
                String age= getIntent().getStringExtra("user-age");

                Spinner s1=(Spinner) findViewById(R.id.spinner1);
                String skill = s1.getSelectedItem().toString();
                Spinner s2=(Spinner) findViewById(R.id.spinner2);
                String goal = s2.getSelectedItem().toString();

                final DatePicker D = (DatePicker) findViewById(R.id.datePicker2);
                final Button setBtn = (Button) findViewById(R.id.Button_to_home);

                Intent i = new Intent(getApplicationContext(), Final.class);
                i.putExtra("user-fname",fname);
                i.putExtra("user-lname",lname);
                i.putExtra("user-sex",sex);
                i.putExtra("user-age",age);
                i.putExtra("start-day",D.getDayOfMonth());
                i.putExtra("start-month",D.getMonth());
                i.putExtra("start-year",D.getYear());
                i.putExtra("skill",skill);
                i.putExtra("goal",goal);
                startActivity(i);
            }
        });

    }

}
