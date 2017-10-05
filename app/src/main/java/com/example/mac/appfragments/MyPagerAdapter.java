package com.example.mac.appfragments;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 3;

    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return RestauFragment.newInstance(0, "");
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return HotelsFragment.newInstance(1, "Hotels");
           case 2: // Fragment # 1 - This will show SecondFragment
               return NightClubsFragment.newInstance(2, "Night Clubs");
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Restaurants";
            case 1:
                return "Hotels";
            case 2:
                return "Night Clubs";



        }
        return null;



    }
}
