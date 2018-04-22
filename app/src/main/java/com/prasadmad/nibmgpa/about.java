package com.prasadmad.nibmgpa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Prasad on 4/27/17.
 */

public class about extends AppCompatActivity {

    private TextView contact;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(about.this,MainActivity.class));
        overridePendingTransitionEnter();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        contact=(TextView)findViewById(R.id.Contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send();
            }
        });
    }

    private void send(){
        final String[] developerEmail={"prasad.mads@gmail.com"};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, developerEmail);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "NIBM GPA Calculator");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Hello Prasad,\nYour NIBM GPA calculator app is awesome !!!");
        emailIntent.setType("message/rfc822");

        try {
            startActivity(Intent.createChooser(emailIntent, "Select email client"));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(about.this,
                    "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }
    }


    protected void overridePendingTransitionEnter() {
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
    }
}
