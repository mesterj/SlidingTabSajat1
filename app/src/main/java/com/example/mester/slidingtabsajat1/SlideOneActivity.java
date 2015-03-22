package com.example.mester.slidingtabsajat1;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;


import static com.example.mester.slidingtabsajat1.R.id.viewpager;


public class SlideOneActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_one);
        ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
        MyViewPagerAdapter adapter = new MyViewPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);


    }


}
