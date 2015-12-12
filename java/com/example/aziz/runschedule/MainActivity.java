package com.example.aziz.runschedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText first_name =  (EditText) findViewById(R.id.Fname);
        final EditText last_name =  (EditText) findViewById(R.id.Lname);
        final EditText sex =  (EditText) findViewById(R.id.Gender);
        final EditText age =  (EditText) findViewById(R.id.Age);

        Button b =(Button)findViewById(R.id.btnSubmit);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), Your_goal.class);
                i.putExtra("user-fname",first_name.getText().toString());
                i.putExtra("user-lname",last_name.getText().toString());
                i.putExtra("user-sex",sex.getText().toString());
                i.putExtra("user-age",age.getText().toString());
                startActivity(i);
            }
        });
    }


}
