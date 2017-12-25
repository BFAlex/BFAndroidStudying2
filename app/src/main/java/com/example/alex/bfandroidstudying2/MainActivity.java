package com.example.alex.bfandroidstudying2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import Drawer.BFSliderDrawerActivity;
import ViewPager.BFViewPagerActivity1;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void actionVPBtn1(View view) {
        Intent vp1Intent = new Intent(this, BFViewPagerActivity1.class);
        startActivity(vp1Intent);
    }

    public void actionSDBtn(View view) {
        Intent sdIntent = new Intent(this, BFSliderDrawerActivity.class);
        startActivity(sdIntent);
    }
}
