package com.projects.cecile.newsapp;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TinFragmentPagerAdapter extends FragmentPagerAdapter {
    private Fragment[] fragments = new Fragment[FRAGMENT_NUMBER];
    // Set number of fragment containers.
    public static int FRAGMENT_NUMBER = 3;

    public TinFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // Sanity check.
        if (position < 0 || position >= FRAGMENT_NUMBER) {
            throw new IndexOutOfBoundsException("Out of Boundary");
        }
        return fragments[position];
    }

    @Override
    public int getCount() {
        return FRAGMENT_NUMBER;
    }
}

