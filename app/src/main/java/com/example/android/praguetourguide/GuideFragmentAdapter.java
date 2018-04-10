package com.example.android.praguetourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuideFragmentAdapter extends FragmentPagerAdapter {
    public GuideFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Monuments", "Restaurants", "Hotels"};


    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new MonumentsFragment();
        } else if (position == 1){
            return new RestaurantsFragment();
        } else {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
