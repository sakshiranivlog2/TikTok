package com.example.newapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {

    Handler h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        ///////
       getWindow().addFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN );
        /////////

        h = new Handler();
        h.postDelayed( new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(Splash.this, HomeActivity.class );
                startActivity( i );
                finish();

            }
        }, 2000);


    }
}

