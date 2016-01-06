package com.amriterry.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PagingFragment extends Fragment {

	private int pageNum;

	public PagingFragment(int pageNum) {
		this.pageNum = pageNum;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_paging, container, false);

		((TextView) view.findViewById(R.id.tvPage)).setText(Integer.toString(pageNum));

		return view;
	}
}
