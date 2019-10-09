package com.example.neegoods;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ProfileAct extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);

        tv = (TextView) findViewById(R.id.tvWelcome);

        tv.setText("welcome  ".toUpperCase() + MyDb.username.toUpperCase());
    }

public void goToAct(View v){

    if (v.getId()==R.id.button2)
    {
        Intent i = new Intent(this ,ChangePasswordAct.class);
        startActivity(i);
    }
    if (v.getId()==R.id.button4)
    {
        Intent i = new Intent(this ,VotingRate.class);
        startActivity(i);
    }
    if (v.getId()==R.id.button10)
    {

       Intent i = new Intent(this ,ResultAct.class);

       startActivity(i);

    }
    }
}
