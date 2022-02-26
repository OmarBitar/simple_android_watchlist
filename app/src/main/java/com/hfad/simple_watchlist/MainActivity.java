package com.hfad.simple_watchlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//more info on fragment transactions go to HEADFIRST PG 420
		Fragment movieFrag = new moviesFragment();
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.replace(R.id.mainFragment,movieFrag).commit();

		View cardViewLayout = getLayoutInflater().inflate(R.layout.text_row_item,null);
	}

	public void onClickSeries(View view) {
		Fragment seriesFrag = new seriesFragment();
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.addToBackStack(null);
		ft.replace(R.id.mainFragment,seriesFrag).commit();
	}

	public void onClickMovies(View view) {
		Fragment movieFrag = new moviesFragment();
		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.addToBackStack(null);
		ft.replace(R.id.mainFragment,movieFrag).commit();
	}

}