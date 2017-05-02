package com.example.animationdemo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //分解，把一个activity分解成为两部分的，进入
//            getWindow().setEnterTransition(new Explode().setDuration(2000));
//            getWindow().setExitTransition(new Explode().setDuration(2000));
            //滑动进入
//            getWindow().setEnterTransition(new Slide().setDuration(2000));
//            getWindow().setExitTransition(new Slide().setDuration(2000));
           //淡入淡出
//            getWindow().setEnterTransition(new Fade().setDuration(2000));
//            getWindow().setExitTransition(new Fade().setDuration(2000));
        }
    }
}
