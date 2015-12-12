package com.example.aziz.runschedule;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class Final extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        String fname= getIntent().getStringExtra("user-fname");
        String lname= getIntent().getStringExtra("user-lname");
        String sex= getIntent().getStringExtra("user-sex");
        String age= getIntent().getStringExtra("user-age");

        int d=getIntent().getIntExtra("start-day", 10);
        int m=getIntent().getIntExtra("start-month", 10);
        int y=getIntent().getIntExtra("start-year", 10);

        String skill= getIntent().getStringExtra("skill");
        String goal= getIntent().getStringExtra("goal");

        TextView n =(TextView)findViewById(R.id.textView4);
        n.setText("Your first name is" + fname+" your last name is "+ lname+ " your gender is " + sex + " you are "+ age +" years old");


        TextView start =(TextView)findViewById(R.id.textView5);
        start.setText("Dont be lazy you should start the day before "+ d +"/"+ m +"/"+y);

        TextView r =(TextView)findViewById(R.id.textView6);
        r.setText("you are a " + skill + " with a long way to go to run " + goal);

        if(Objects.equals(goal, "5K") && (Objects.equals(skill, "Couch Potato"))) {
            ImageView image = (ImageView) findViewById(R.id.imageView);
            image.setImageResource(R.drawable.five_beginner);
        }
            else {
            if (Objects.equals(goal, "5K") && (Objects.equals(skill, "Intermediate"))) {
                ImageView image = (ImageView) findViewById(R.id.imageView);
                image.setImageResource(R.drawable.five_intermediate);
            }

            if(Objects.equals(goal, "5K") && (Objects.equals(skill, "Usain Bolt"))) {
                ImageView image = (ImageView) findViewById(R.id.imageView);
                image.setImageResource(R.drawable.five_advanced);
            }
            if(Objects.equals(goal, "10K") && (Objects.equals(skill, "Couch Potato"))) {
                ImageView image = (ImageView) findViewById(R.id.imageView);
                image.setImageResource(R.drawable.ten_beginner);
        }
            if(Objects.equals(goal, "10K") && (Objects.equals(skill, "Intermediate"))) {
                ImageView image = (ImageView) findViewById(R.id.imageView);
                image.setImageResource(R.drawable.ten_intermediate);
            }
            if(Objects.equals(goal, "10K") && (Objects.equals(skill, "Usain Bolt"))) {
                ImageView image = (ImageView) findViewById(R.id.imageView);
                image.setImageResource(R.drawable.ten_advanced);
            }
    }}}


