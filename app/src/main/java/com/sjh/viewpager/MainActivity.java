package com.sjh.viewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jude.rollviewpager.RollPagerView;

public class MainActivity extends AppCompatActivity {
    private RollPagerView rollPagerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollPagerView = (RollPagerView) findViewById(R.id.scrollView);
    }
}
