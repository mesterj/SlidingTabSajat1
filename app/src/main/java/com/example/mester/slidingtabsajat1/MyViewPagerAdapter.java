package com.example.mester.slidingtabsajat1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by mester on 2014.12.11..
 */
public class MyViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments ;

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);

        fragments = new ArrayList<Fragment>();
        fragments.add(new FragmentOne());
        fragments.add(new FragmentTwo());
        fragments.add(new FragmentThree());
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return FragmentOne.TAG;
            case 1:
                return FragmentTwo.TAG;
            case 2:
                return FragmentThree.TAG;
            default:
                return null;
        }

    }
}
