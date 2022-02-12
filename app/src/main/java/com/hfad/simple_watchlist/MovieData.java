package com.hfad.simple_watchlist;

public class MovieData {
	private String title;
	private int poster;

	public String getTitle() {
		return title;
	}

	public int getPoster() {
		return poster;
	}
	public MovieData(String title, int poster) {
		this.title = title;
		this.poster = poster;
	}

	public MovieData() {
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

	public static final MovieData movies[] = {
			new MovieData("batman",R.drawable.batman_poster),
			new MovieData("superman",R.drawable.superman),
			new MovieData("Iceman",R.drawable.iceman),
			new MovieData("Inception",R.drawable.inception),
			new MovieData("Pulp Fiction",R.drawable.pulp_fiction),
			new MovieData("Gangs of New York",R.drawable.gangs_of_new_york),
			new MovieData("matrix",R.drawable.matrix),
			new MovieData("sonic",R.drawable.sonic),
			new MovieData("free guy",R.drawable.free_guy),
	};
}
