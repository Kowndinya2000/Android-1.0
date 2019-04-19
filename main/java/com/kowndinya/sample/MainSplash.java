package com.kowndinya.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainSplash extends AppCompatActivity {

    private final android.os.Handler waitHandler = new android.os.Handler();
    private final Runnable waitCallback = new Runnable() {
        @Override
        public void run() {
            startActivity(new Intent(MainSplash.this,MainActivity1.class));
            finish();
        }
    };
    TextView textSplash1;
    TextView textSplash2;
    Animation bT;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textSplash1 = findViewById(R.id.t1);
       textSplash2 = findViewById(R.id.t2);
        bT = AnimationUtils.loadAnimation(this,R.anim.bottom_up);
        textSplash1.setAnimation(bT);
        textSplash2.setAnimation(bT);
    }
    @Override
    protected void onResume(){
        super.onResume();
        waitHandler.postDelayed(waitCallback,3000);

    }
    @Override
    protected void onDestroy(){
        waitHandler.removeCallbacks(waitCallback);
        super.onDestroy();
    }
    @Override
    public void onBackPressed()
    {

    }
}

