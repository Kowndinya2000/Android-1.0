package com.kowndinya.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppCompatImageView I;
    AppCompatImageView I2;
    AppCompatImageView I3;
    AppCompatImageView I4;
    AppCompatImageView I5;
    AppCompatImageView I6;
    Toolbar t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        I = findViewById(R.id.g);
        I2 = findViewById(R.id.fb);
        I3 = findViewById(R.id.gP);
        I4 = findViewById(R.id.tW);
        I5 = findViewById(R.id.in);
        I6 = findViewById(R.id.iT);
        t  = findViewById(R.id.toolbar);
        setSupportActionBar(t);
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Congrats developers you're now signed in",Toast.LENGTH_LONG).show();
            }
        });
        I2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Congrats developers you're now signed in",Toast.LENGTH_LONG).show();
            }
        });
        I3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Congrats developers you're now signed in",Toast.LENGTH_LONG).show();
            }
        });
        I4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Congrats developers you're now signed in",Toast.LENGTH_LONG).show();
            }
        });
        I5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Congrats developers you're now signed in",Toast.LENGTH_LONG).show();
            }
        });
        I6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Congrats developers you're now signed in",Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.cancel:
                finish();
                break;
        } return super.onOptionsItemSelected(item);

    }

}
