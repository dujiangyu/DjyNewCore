package com.pingxundata.answerliu.pxcore.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


/**
 * TabLayout适配器
 */
public class TabFragmentAdapter extends FragmentPagerAdapter {

    private final List<String> titles;
    private Context context;
    private List<Fragment> fragments;

    public TabFragmentAdapter(List<Fragment> fragments, List<String> titles, FragmentManager fm, Context context) {
        super(fm);
        this.context = context.getApplicationContext();
        this.fragments = fragments;
        this.titles = titles;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}
