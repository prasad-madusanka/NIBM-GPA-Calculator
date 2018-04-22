package com.prasadmad.nibmgpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private common commonAtt;
    private Button dcsd_dse,dcsd15, dcsd161,dcsd162,hdcbis162,hdcbis171,adbm,hdbm,custom;
    private Spinner subjects;
    private ImageButton about;
    private int subs=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup);

       try {

           initialize();
           commonAtt = new common();

           subjects.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
               @Override
               public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                   subs = commonAtt.getCorrespondingValue(position);
               }

               @Override
               public void onNothingSelected(AdapterView<?> parent) {

               }
           });

           onClick(dcsd_dse, dcsd_dse_171.class);
           onClick(dcsd15, dcsd15.class);
           onClick(dcsd161, dcsd161.class);
           onClick(dcsd162, dcsd162.class);
           onClick(hdcbis162, hdcbis162.class);
           onClick(hdcbis171, hdcbis171.class);
           onClick(adbm, adbm.class);
           onClick(hdbm, hdbm.class);

           custom.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   startActivity(new Intent(MainActivity.this, custom.class).putExtra("SUBS", subs));
                   overridePendingTransitionEnter();
               }
           });

           about.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   startActivity(new Intent(MainActivity.this, about.class));
                   overridePendingTransitionExit();
               }
           });

       }catch (Exception ex){
               Log.d("OnCrExceptionsMain",ex.toString());
       }

    }

    private void initialize()throws Exception{
        dcsd_dse =(Button)findViewById(R.id.dcsd_dse_171);
        dcsd15=(Button)findViewById(R.id.dcsd15);
        dcsd161=(Button)findViewById(R.id.dcsd161);
        dcsd162 =(Button)findViewById(R.id.dcsd162);
        hdcbis162=(Button)findViewById(R.id.hdcbis162);
        hdcbis171=(Button)findViewById(R.id.hdcbis171);


        adbm=(Button)findViewById(R.id.adbm);
        hdbm=(Button)findViewById(R.id.hdbm);

        custom=(Button)findViewById(R.id.custom);
        subjects=(Spinner)findViewById(R.id.customSpinner);
        about=(ImageButton) findViewById(R.id.about);


    }

    private void onClick(Button button, final Class cls)throws Exception{
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,cls));
                overridePendingTransitionEnter();
            }
        });
    }


    protected void overridePendingTransitionEnter() {
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
        finish();
    }

    protected void overridePendingTransitionExit() {
        finish();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }
}