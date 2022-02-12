package com.hfad.simple_watchlist;

public class SeriesData {
	private String title;
	private int poster;

	public String getTitle() {
		return title;
	}

	public int getPoster() {
		return poster;
	}
	public SeriesData(String title, int poster) {
		this.title = title;
		this.poster = poster;
	}

	public SeriesData() {
	}

	public String[] getFilmTitles() {
		String Filmtitles[] = new String[movies.length];
		for (int index = 0; index < movies.length; index++) {
			Filmtitles[index] = movies[index].getTitle();
		}
		return Filmtitles;
	}

	public int[] getFilmPosters() {
		int Filmtitles[] = new int[movies.length];
		for (int index = 0; index < movies.length; index++) {
			Filmtitles[index] = movies[index].getPoster();
		}
		return Filmtitles;
	}

	public static final SeriesData movies[] = {
			new SeriesData("game of thrones",R.drawable.game_of_thrones),
			new SeriesData("arcane",R.drawable.arcane),
			new SeriesData("squid game",R.drawable.squid_game),
			new SeriesData("the walking dead",R.drawable.walking_dead),
			new SeriesData("breaking bad",R.drawable.breaking_bad),
	};
}
