package com.kowndinya.sample;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    Toolbar t1;
    TextView tV;
     LinearLayout linearLayout;
     DrawerLayout drawerLayout;
     NavigationView navigationView;
     RadioButton r1,r2,r3,r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);
        t1 = findViewById(R.id.toolbar1);
        r1 = findViewById(R.id.radioButton1);
        r2 = findViewById(R.id.radioButton2);
        r3 = findViewById(R.id.radioButton3);
        r4 = findViewById(R.id.radioButton4);
        tV = findViewById(R.id.text_android);
        setSupportActionBar(t1);
        linearLayout = findViewById(R.id.linear);

        drawerLayout = findViewById(R.id.drawer_Layout);
        navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle;
        toggle = new ActionBarDrawerToggle(this,drawerLayout,t1,R.string.opens,R.string.closes);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Typeface typeface = ResourcesCompat.getFont(getApplicationContext(),R.font.caesar_dressing);
                tV.setTypeface(typeface);
            }
        });
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tV.setTypeface(Typeface.DEFAULT);
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Typeface typeface = ResourcesCompat.getFont(getApplicationContext(),R.font.warnes);
                tV.setTypeface(typeface);
            }
        });
        r4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Typeface typeface = ResourcesCompat.getFont(getApplicationContext(),R.font.bowlby_one_sc);
                tV.setTypeface(typeface);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.help:
                startActivity(new Intent(this,MessageActivity.class));
                break;
            case R.id.donate:
                startActivity(new Intent(this,DonateActivity.class));
                break;
            case R.id.settings:
                Snackbar snackbar;
                snackbar = Snackbar.make(linearLayout, "Creating Settings tab is left to you", Snackbar.LENGTH_LONG);
                View snackView = snackbar.getView();
                TextView textView = snackView.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(Color.parseColor("#D7FF31"));
                snackbar.show();
                break;
        } return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId())
        {
            case R.id.hom:
                startActivity(new Intent(this,MainActivity1.class));
                break;
            case R.id.feed:
                startActivity(new Intent(this,MessageActivity.class));
                break;
            case R.id.rate:
                startActivity(new Intent(this,MainActivity2.class));
                break;
            case R.id.share:
                Snackbar snackbar;
                snackbar = Snackbar.make(linearLayout, "Just to Show!", Snackbar.LENGTH_LONG);
                View snackView = snackbar.getView();
                TextView textView = snackView.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(Color.parseColor("#47DCFF"));
                snackbar.show();
                break;
            case R.id.tools:
                Snackbar snackbar2;
                snackbar2 = Snackbar.make(linearLayout, "Just to Show!", Snackbar.LENGTH_LONG);
                View snackView2 = snackbar2.getView();
                TextView textView2 = snackView2.findViewById(android.support.design.R.id.snackbar_text);
                textView2.setTextColor(Color.parseColor("#47DCFF"));
                snackbar2.show();
                break;

        }
        return true;
    }
}
