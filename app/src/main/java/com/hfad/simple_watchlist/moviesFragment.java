package com.hfad.simple_watchlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class moviesFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_movies, container, false);

		RecyclerView rc = (RecyclerView) view.findViewById(R.id.recycleView);
		// see page 557 for differrent types of layout setups
		rc.setLayoutManager(new GridLayoutManager(view.getContext(),2));
		CustomAdapter adapter = new CustomAdapter(new MovieData().getFilmTitles());
		rc.setAdapter(adapter);
		// Inflate the layout for this fragment
		return view;
	}
}