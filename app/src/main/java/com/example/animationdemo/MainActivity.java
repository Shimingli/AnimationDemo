package com.example.animationdemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View view = findViewById(R.id.btn);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                /**
                 * in 的动画是第二个activity （）进入的动画，out是第一个activity finish（）的动画
                 * 如果两个时间不一样的话，这就会导致一种翻书的效果，in out的动画是从下往上的动画
                 */
//                overridePendingTransition(R.anim.in,R.anim.out);

                //大于21 才可以
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                    startActivity(new Intent(MainActivity.this, Main2Activity.class), ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
//                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(new Intent(MainActivity.this,Main2Activity.class), ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,view,"mybtn").toBundle());
                }
            }
        });

//           可以引入动画
          //AnimationUtils.loadAnimation(this,R.anim.my_action);

        final ImageView imageview = (ImageView) findViewById(R.id.imgview);
        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(new Intent(MainActivity.this,Main2Activity.class), ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,imageview,"imageview").toBundle());
                }
            }
        });
    }
}
