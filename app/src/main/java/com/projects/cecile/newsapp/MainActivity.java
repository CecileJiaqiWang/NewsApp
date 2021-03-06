package com.projects.cecile.newsapp;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;

import com.projects.cecile.newsapp.common.TinBasicActivity;

public class MainActivity extends TinBasicActivity {
    private ViewPager viewPager;
    private BottomNavigationView bottomBar;
    private TinFragmentPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link no swipe view pager with view.
        viewPager = findViewById(R.id.viewpager);
        adapter = new TinFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        // Keep the other fragments alive.
        viewPager.setOffscreenPageLimit(TinFragmentPagerAdapter.FRAGMENT_NUMBER);
    }

    @Override
    protected int getLayout() {
        // Should have the same layout as the main activity.
        return R.layout.activity_main;
    }

    @Override
    public void showSnackBar(String message) {

    }
}

