package com.hfad.simple_watchlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
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

		String movieData[] = {"batman","superman","inception","godfather","goodfellas"};
		RecyclerView rc = (RecyclerView) view.findViewById(R.id.recycleView);
		rc.setLayoutManager(new LinearLayoutManager(view.getContext()));
		CustomAdapter adapter = new CustomAdapter(movieData);
		rc.setAdapter(adapter);
		// Inflate the layout for this fragment
		return view;
	}
}