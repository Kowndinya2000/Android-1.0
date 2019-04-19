package com.kowndinya.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DonateActivity extends AppCompatActivity {
    LinearLayout lp;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
        lp = findViewById(R.id.layout_donate);
    }
    public void donates(View view)
    {
        Snackbar snackbar;
        snackbar = Snackbar.make(lp, "Thanks for donating!", Snackbar.LENGTH_LONG);
        View snackView = snackbar.getView();
        TextView textView = snackView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.parseColor("#D7FF31"));
        snackbar.show();
    }
}
