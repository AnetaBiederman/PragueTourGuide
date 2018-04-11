package com.example.android.praguetourguide;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class GuideFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    //Public constructor for the ViewPager Adapter
    public GuideFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new MonumentsFragment();
        } else if (position == 1){
            return new RestaurantsFragment();
        } else if (position == 2){
            return new HotelsFragment();
        } else {
            return new FunFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //Set the titles of the tabs for the TabLayout
        if (position == 0){
            return mContext.getString(R.string.monuments_activity);
        }
        else if (position == 1){
            return mContext.getString(R.string.restaurants_activity);
        }
        else if (position == 2){
            return mContext.getString(R.string.hotels_activity);
        }
        else {
            return mContext.getString(R.string.fun_activity);
        }
    }
}
