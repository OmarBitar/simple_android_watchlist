package com.hfad.simple_watchlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class seriesFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_series, container, false);
		RecyclerView rc = (RecyclerView) view.findViewById(R.id.recycleView);
		// see page 557 for differrent types of layout setups
		rc.setLayoutManager(new GridLayoutManager(view.getContext(),2));
		SeriesData seriesData = new SeriesData();
		CustomAdapter adapter = new CustomAdapter(seriesData.getFilmTitles(),seriesData.getFilmPosters());
		rc.setAdapter(adapter);
		return view;
	}
}