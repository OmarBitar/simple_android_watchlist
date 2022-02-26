package com.hfad.simple_watchlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class moviesFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_movies, container, false);

		RecyclerView rc = (RecyclerView) view.findViewById(R.id.recycleView);
		// see page 557 for differrent types of layout setups
		rc.setLayoutManager(new GridLayoutManager(view.getContext(),2));
		MovieData movieData = new MovieData();
		CustomAdapter adapter = new CustomAdapter(movieData.getFilmTitles(),movieData.getFilmPosters());
		rc.setAdapter(adapter);
		adapter.setListener(new CustomAdapter.Listener() {
			@Override
			public void onLikeClick() {
				Toast.makeText(view.getContext(),"Liked",Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onDisLikeClick() {
				Toast.makeText(view.getContext(),"disLiked",Toast.LENGTH_SHORT).show();
			}
		});
		// Inflate the layout for this fragment
		return view;
	}
}