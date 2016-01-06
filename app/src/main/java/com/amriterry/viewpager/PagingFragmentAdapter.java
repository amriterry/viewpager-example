package com.amriterry.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagingFragmentAdapter extends FragmentStatePagerAdapter {
	
	private final static int COUNT = 5;

	public PagingFragmentAdapter(FragmentManager fm) {
		super(fm);
		
	}

	@Override
	public Fragment getItem(int arg0) {
		return new PagingFragment(arg0 + 1);
	}

	@Override
	public int getCount() {
		return COUNT;
	}

}
