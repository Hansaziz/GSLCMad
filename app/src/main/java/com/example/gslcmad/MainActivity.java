package com.example.gslcmad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnuserdata,btnevencal,btnexit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnuserdata = (Button) findViewById(R.id.btnuserdata);
        btnuserdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {openuserdata();}
            }
        });
        btnevencal = (Button) findViewById(R.id.btnevencal);
        btnevencal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {openevencall();}
            }
        });
    }
    public void openuserdata(){
        Intent intent =  new Intent(this,UserDataact.class);
        startActivity(intent);
    }
    public void openevencall(){
        Intent intent =  new Intent(this,ViewEventCal.class);
        startActivity(intent);
    }
    public void onClickExit (View v){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}