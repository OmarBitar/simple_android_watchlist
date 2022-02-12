package com.hfad.simple_watchlist;

public class MovieData {
	private String title;
	private int poster;

	public String getTitle() {
		return title;
	}

	public MovieData(String title) {
		this.title = title;
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

	public static final MovieData movies[] = {
			new MovieData("batman"),
			new MovieData("superman"),
			new MovieData("Iceman"),
			new MovieData("Inception"),
			new MovieData("Pulp Fiction"),
			new MovieData("Gangs of New York")
	};
}
