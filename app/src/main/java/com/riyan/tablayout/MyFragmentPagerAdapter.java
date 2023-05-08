package com.riyan.tablayout;

import android.content.Context;
import android.icu.lang.UCharacterEnums;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private BeritaFragment _beritaFragment = new BeritaFragment();
    private Context _context;
    private ECommerceFragment _eCommerceFragemnt = new ECommerceFragment();
    private int _tabCount;
    private KampusFragment _kampusFragment = new KampusFragment();

    public MyFragmentPagerAdapter(Context _context, FragmentManager fragmentManager, int tabCount) {

        super(fragmentManager);

        _context = _context;
        _tabCount = tabCount;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return _eCommerceFragemnt;
            case 1:
                return _beritaFragment;
            default:
                return _kampusFragment;
        }
    }

    @Override
    public int getCount() {
        return _tabCount;
    }
}
